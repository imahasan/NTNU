import datetime
from pydoc import stripid
import re
from typing import TypedDict
from DbConnector import DbConnector
from tabulate import tabulate
import csv
import os
from dotenv import load_dotenv
from datetime import datetime

"""
This script contains helper functions to read from the dataset
and convert the data to queries and queries values so that they can be executed
somewhere else.

"""

#Used to load the env file
load_dotenv()

DATASET_PATH = os.getenv("DATASET_PATH")

def get_user_documents():
    """
    Reads from the labeled_ids files in order to know what value to give each
    user for the has_labels field. Creates and returns the query to insert the users.
    """

    user_ids = get_user_ids()
    labeled_ids = []

    #Reads from the labeled_ids files and retrieves those ids who has labels
    with open(f"{DATASET_PATH}/labeled_ids.txt") as f:
        labeled_ids = f.readlines()
        for i in range(len(labeled_ids)):
            labeled_ids[i] = labeled_ids[i].strip()

    #A string containing the values to be inserted into the database
    user_documents = []

    for id in user_ids:
        has_label = False
        if id in labeled_ids:
            has_label = True
        
        user = {
            '_id': id,
            'has_labels': has_label, 
            'activity_ref': []
        }

        user_documents.append(user)
    
    return user_documents


def get_user_ids():
    """
    Returns the user ids by reading the folder names in the Data fodler
    """

    folder = f"{DATASET_PATH}/Data"
    return [name for name in os.listdir(folder) if os.path.isdir(os.path.join(folder, name))]

def build_transportation_map(user_id: str):
    """
    Builds a dictionary for a specific user where the key is the start time and date time of 
    a labeled data concatenated with just the digts. The value is the transportation mode. 
    """

    tmap = {}

    with open(f"{DATASET_PATH}/Data/{user_id}/labels.txt") as f:
        for line in f.readlines():
            line_split = line.split("\t")
            tmap_key = line_split[0] + line_split[1]
            tmap_key = re.sub("\D", "", tmap_key) #Removes all non digits

            tmode = line_split[2].strip()

            tmap[tmap_key] = tmode

    return tmap

def build_activity_documents(user_id: str, activity_map: TypedDict):
    """
    Builds a value string containing all the activites 
    of an user to be inserted into the database
    """

    path = f"{DATASET_PATH}/Data/{user_id}"
    
    dir_list = os.listdir(path) #List of the directory of the user

    tranportation_map = None

    if("labels.txt" in dir_list):
        tranportation_map = build_transportation_map(user_id)
        
    activity_documents = []

    for key in activity_map:
        track_point_docs = activity_map[key]
        first_track = track_point_docs[0]
        last_track = track_point_docs[-1]

        start_time_date = first_track["date_time"]
        end_time_date = last_track["date_time"]

        #Creates a transportation key build by the start time and end time of the first and last track point
        tkey = f"{start_time_date}{end_time_date}"
        tkey = tkey.replace(" ", "")
        tkey = re.sub("\D", "", tkey)

        t_mode = None

        # Uses the transportation_map to check to find the corresponding transportation label
        # if the user has labels.
        if tranportation_map:
            if tkey in tranportation_map:
                t_mode = tranportation_map[tkey]
        
        activity_document = {
            '_id':key,
            'transportation_mode': t_mode,
            'start_date_time': datetime.fromisoformat(f"{start_time_date}"),
            'end_date_time': datetime.fromisoformat(f"{end_time_date}"),
            'user_ref': user_id,
            'track_point_ref': []
        }

        # Adds the ref to all the track points for a given activity
        for track_point_doc in track_point_docs:
            activity_document["track_point_ref"].append(track_point_doc["_id"])

        activity_documents.append(activity_document)

    return activity_documents
               

def get_activity_track_points(user_id: str, activity_gid: list[int], track_point_gid: list[int]):
    """
    For a given user, creates a dictionary containing all the track points for each actvitiy.
    The key is the id of an activity (genereated in the code) and the value is the list of track points for
    the given activity. 

    Parameters
    ----------
    user_id: Id of the specific user
    activity_gid: The global id of the activites to be incremented for each activity
    """

    a_map = {}

    trajectory_list = os.listdir(f"{DATASET_PATH}/Data/{user_id}" + "/Trajectory")

    for trajectory in trajectory_list:
        
        with open(f"{DATASET_PATH}/Data/{user_id}/Trajectory/{trajectory}") as plt_file:
            for _ in range(6):
                next(plt_file)

            lines = plt_file.readlines()

            # Adds only the activites who has 2500 or less track points
            if(len(lines) <= 2500):
                activity_gid[0] += 1
                activity = []
                for line in lines:
                    new_line = line.strip()
                    new_line = new_line.split(",")

                    activity_tp_doc = {
                        '_id': track_point_gid[0],
                        'lat': float(new_line[0]),
                        'lon': float(new_line[1]),
                        'altitude': (None if float(new_line[3]) == -777 else float(new_line[3])),
                        'date_days': float(new_line[4]),
                        'date_time': datetime.fromisoformat(f"{new_line[5]} {new_line[6]}"),
                        'activity_ref': activity_gid[0]
                    }

                    activity.append(activity_tp_doc)

                    track_point_gid[0] += 1

                a_map[activity_gid[0]] = activity
                
    return a_map


def update_user_activity_ref(user_document, activity_documents):
    for activity_document in activity_documents:
        user_document["activity_ref"].append(activity_document["_id"])

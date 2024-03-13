from pydoc import stripid
import re
from DbConnector import DbConnector
from tabulate import tabulate
import csv
import os
from dotenv import load_dotenv

load_dotenv()

DATASET_PATH = os.getenv("DATASET_PATH")

def get_insert_users():
    user_ids = get_user_ids()
    labeled_ids = []

    with open(f"{DATASET_PATH}/labeled_ids.txt") as f:
        labeled_ids = f.readlines()
        for i in range(len(labeled_ids)):
            labeled_ids[i] = labeled_ids[i].strip()

    value_string = ""

    for id in user_ids:
        has_label = False
        if id in labeled_ids:
            has_label = True
        value_string += f"('{id}', " + ("TRUE" if has_label else "FALSE") + "), "
    
    value_string = value_string[:len(value_string) - 2]

    query = f"INSERT INTO user VALUES {value_string}"

    return query

def get_insert_all_user_activities(activtiy_user_string):
    query = f"INSERT INTO activity VALUES {activtiy_user_string}"
    return query

def get_insert_track_point_for_user(activities_map):

    track_point_value_string = ""
    track_point_value_string_array = []

    max_values = 1000
    counter = 0

    for key in activities_map:
        activity = activities_map[key]
        for track_point in activity:
            date_time = f"{track_point[5]} {track_point[6]}"
            track_point_value_string += f"({key}, {track_point[0]}, {track_point[1]}, {('NULL' if track_point[3] == -777 else track_point[3])}, {track_point[4]}, '{date_time}'), "
            counter += 1
            if(counter >= max_values):
                track_point_value_string = track_point_value_string[:len(track_point_value_string) - 2]
                track_point_value_string_array.append(track_point_value_string)
                track_point_value_string = ""
                counter = 0
        
    track_point_value_string = track_point_value_string[:len(track_point_value_string) - 2]
    
    if len(track_point_value_string) > 0:
        track_point_value_string_array.append(track_point_value_string)
    
    return track_point_value_string_array


def get_user_ids():
    folder = f"{DATASET_PATH}/Data"
    return [name for name in os.listdir(folder) if os.path.isdir(os.path.join(folder, name))]

def build_transportation_map(user_id):
    tmap = {}

    with open(f"{DATASET_PATH}/Data/{user_id}/labels.txt") as f:
        for line in f.readlines():
            line_split = line.split("\t")
            tmap_key = line_split[0] + line_split[1]
            tmap_key = re.sub("\D", "", tmap_key) #Removes all non digits

            tmode = line_split[2].strip()

            tmap[tmap_key] = tmode

    return tmap

def build_user_activity_insert_value(user_id, activity_map):

    path = f"{DATASET_PATH}/Data/{user_id}"
    
    dir_list = os.listdir(path) #List of the directory of the user

    tranportation_map = None

    if("labels.txt" in dir_list):
        tranportation_map = build_transportation_map(user_id)
        
    con_cat_values_string = ""

    for key in activity_map:
        csv_act = activity_map[key]
        first_track = csv_act[0]
        last_track = csv_act[-1]

        start_time_date = f"{first_track[5]} {first_track[6]}"
        end_time_date = f"{last_track[5]} {last_track[6]}"

        tkey = f"{first_track[5]}{first_track[6]}{last_track[5]}{last_track[6]}"
        tkey = re.sub("\D", "", tkey)

        t_mode = None

        if tranportation_map:
            if tkey in tranportation_map:
                t_mode = f"'{tranportation_map[tkey]}'"
        
        value_string = f"({key}, '{user_id}', {'NULL' if t_mode is None else t_mode}, '{start_time_date}', '{end_time_date}' ), "
        
        con_cat_values_string += value_string
    
    return con_cat_values_string
               

def getActivities(user_id, activity_gid):
    a_map = {}

    trajectory_list = os.listdir(f"{DATASET_PATH}/Data/{user_id}" + "/Trajectory")

    for trajectory in trajectory_list:

        activity_gid[0] += 1

        with open(f"{DATASET_PATH}/Data/{user_id}/Trajectory/{trajectory}") as plt_file:
            for _ in range(6):
                next(plt_file)

            lines = plt_file.readlines()

            if(len(lines) <= 2500):
                activity = []
                for line in lines:
                    new_line = line.strip()
                    new_line = new_line.split(",")
                    activity.append(new_line)
                a_map[activity_gid[0]] = activity

    return a_map



"""
insertActivities(["010"])

def dothings:
    insertUsers()
    user_activities = {}
    activity_value_string = ""
    for user in users:
        activities = getActivities(user)
        user_activities[user] = activities
        activity_value_string += build_activity_value_string(user, activites)
    insert_all_user_activities(activity_value_string)
    inserttrackpoints(user_activities)
    """

from pprint import pprint 
from DbConnector import DbConnector
from insert import *

class Program:

    def __init__(self):
        self.connection = DbConnector()
        self.client = self.connection.client
        self.db = self.connection.db

    def create_coll(self, collection_name):
        collection = self.db.create_collection(collection_name)    
        print('Created collection: ', collection)

    def func(self):
        """
        Function to add all the data from the dataset into the database
        """
        user_documents = get_user_documents()

        activity_gid = [0] # Global id for activities
        track_point_gid = [0] # Global id for the track points

        collection_user = self.db['user']
        collection_activity = self.db['activity']
        collection_track_point = self.db['track_point']

        for user in user_documents:
            # Used to determine the 
            activity_track_points = get_activity_track_points(user["_id"], activity_gid, track_point_gid)
            activity_documents = build_activity_documents(user["_id"], activity_track_points)
            update_user_activity_ref(user, activity_documents)

            for key in activity_track_points:
                    collection_track_point.insert_many(activity_track_points[key])

            if activity_documents:
                collection_activity.insert_many(activity_documents)

            print(f"Done for user {user['_id']}")
        
        collection_user.insert_many(user_documents)


    def drop_coll(self, collection_name):
        collection = self.db[collection_name]
        collection.drop()
        
    def show_coll(self):
        collections = self.client['test'].list_collection_names()
        print(collections)
         


def main():
    program = None
    try:
        program = Program()

        program.drop_coll("user")
        program.drop_coll("activity")
        program.drop_coll("track_point")
        
        program.create_coll(collection_name="user")
        program.create_coll(collection_name="activity")
        program.create_coll(collection_name="track_point")

        program.func()

    except Exception as e:
        print("ERROR: Failed to use database:", e)
    finally:
        if program:
            program.connection.close_connection()


if __name__ == '__main__':
    main()

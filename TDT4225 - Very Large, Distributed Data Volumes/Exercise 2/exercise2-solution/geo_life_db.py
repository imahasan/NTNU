from DbConnector import DbConnector
from tabulate import tabulate
from insert import *


class Program:

    def __init__(self):
        self.connection = DbConnector()
        self.db_connection = self.connection.db_connection
        self.cursor = self.connection.cursor
        self.user_activities = {}
        self.activity_gid = [0]

    def init_tables(self):

        create_user = """CREATE TABLE IF NOT EXISTS user (
           id VARCHAR(256) NOT NULL PRIMARY KEY,
           has_labels BOOLEAN)
        """

        create_activity = """CREATE TABLE IF NOT EXISTS activity (
                id BIGINT NOT NULL PRIMARY KEY,
                user_id VARCHAR(256) NOT NULL,
                transportation_mode VARCHAR(256),
                start_date_time DATETIME,
                end_date_time DATETIME,
                FOREIGN KEY(user_id) REFERENCES user(id))
                """

        create_track_point = """CREATE TABLE IF NOT EXISTS track_point (
                id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                activity_id BIGINT NOT NULL,
                lat DOUBLE,
                lon DOUBLE,
                altitude INT,
                date_days DOUBLE,
                date_time DATETIME,
                FOREIGN KEY(activity_id) REFERENCES activity(id))
        """
        # This adds table_name to the %s variable and executes the query
        self.cursor.execute(create_user)
        self.cursor.execute(create_activity)
        self.cursor.execute(create_track_point)

        self.db_connection.commit()
    
    def insert_users(self):
        insert_users_query = get_insert_users()
        #self.cursor.execute(insert_users_query)
        #self.db_connection.commit()
    
    def insert_all_activities(self):

        all_user_ids = get_user_ids()

        activities_value_string = ""

        for user_id in all_user_ids:
            #print(user_id)
    
            activities = getActivities(user_id, self.activity_gid)

            if(not activities):
                continue

            self.user_activities[user_id] = activities

            activities_value_string += build_user_activity_insert_value(
                user_id, activities)

        activities_value_string = activities_value_string[:len(activities_value_string) - 2]

        query = get_insert_all_user_activities(activities_value_string)
        
        print(query)

        #self.cursor.execute(query)
        #self.db_connection.commit()
    
    def insert_trackpoints(self):
        for user in self.user_activities:
            print(user)
            activites_map = self.user_activities[user]
            value_string_arrray = get_insert_track_point_for_user(activites_map)

            for value_string in value_string_arrray:
                query = f"INSERT INTO track_point (activity_id, lat, lon, altitude, date_days, date_time) VALUES {value_string}"
                print(query)
                self.cursor.execute(query)
        
        self.db_connection.commit()

def main():
    program = None
    try:
        program = Program()
        program.init_tables()
        program.insert_users()
        program.insert_all_activities()
        print("Done with activities!")
        print("..................................")
        print("..................................")

        program.insert_trackpoints()

    except Exception as e:
        print("ERROR: Failed to use database:", e)
    finally:
        if program:
            program.connection.close_connection()


if __name__ == '__main__':
    main()

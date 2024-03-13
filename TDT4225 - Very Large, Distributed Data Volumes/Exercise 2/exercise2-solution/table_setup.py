from DbConnector import DbConnector
from tabulate import tabulate


connection = DbConnector()
db_connection = connection.db_connection
cursor = connection.cursor

create_user = """CREATE TABLE IF NOT EXISTS user (
           id VARCHAR(256) NOT NULL PRIMARY KEY,
           has_labels BOOLEAN)
        """

create_activity = """CREATE TABLE IF NOT EXISTS activity (
           id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
           user_id VARCHAR(256) NOT NULL,
           transportation_mode VARCHAR(256),
           start_date_time DATETIME,
           end_date_time DATETIME,
           FOREIGN KEY(user_id) REFERENCES user(id))
        """

create_track_point = """CREATE TABLE IF NOT EXISTS track_point (
           id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
           activity_id INT NOT NULL,
           lat DOUBLE,
           lon DOUBLE,
           altitude INT,
           date_days DOUBLE,
           date_time DATETIME,
           FOREIGN KEY(activity_id) REFERENCES activity(id))
        """

try:
    cursor.execute(create_user)
    cursor.execute(create_activity)
    cursor.execute(create_track_point)
    db_connection.commit()
except Exception as e:
    print("ERROR: Failed to create tables. ", e)
finally:
    print("SUCCESS!")
    connection.close_connection()















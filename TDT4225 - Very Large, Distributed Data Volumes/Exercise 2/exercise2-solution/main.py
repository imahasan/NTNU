from DbConnector import DbConnector
from tabulate import tabulate

from insert import *

connection = DbConnector()
db_connection = connection.db_connection
cursor = connection.cursor


#Inserts the user
cursor.execute(insertUsers())


user_ids = get_user_ids()

user_activities = {}
activities_value_string = ""

for user_id in user_ids:
    print(user_id)
    print("-------")
    activities = getActivities(user_id)

    if(not activities): continue

    user_activities[user_id] = activities
    
    activities_value_string = build_user_activity_insert_value(user_id, activities) 
    
    print(activities_value_string)
    query = insert_all_user_activities(activities_value_string)

    cursor.execute(query)

    print("")

#activities_value_string = activities_value_string[:len(activities_value_string) - 2]


db_connection.commit()


def fetch_data(table_name):
    query = "SELECT * FROM %s ORDER BY id"
    cursor.execute(query % table_name)
    rows = cursor.fetchall()
    print("Data from table %s, raw format:" % table_name)
    print(rows)
    # Using tabulate to show the table in a nice way
    print("Data from table %s, tabulated:" % table_name)
    print(tabulate(rows, headers=cursor.column_names))
    return rows


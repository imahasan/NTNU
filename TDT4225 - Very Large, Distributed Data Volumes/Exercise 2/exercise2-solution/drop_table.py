from DbConnector import DbConnector

connection = DbConnector()
db_connection = connection.db_connection
cursor = connection.cursor

drop = "DROP TABLE IF EXISTS track_point RESTRICT; DROP TABLE IF EXISTS activity RESTRICT; DROP TABLE IF EXISTS user RESTRICT;"

cursor.execute(drop)

connection.close_connection()
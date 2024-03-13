from DbConnector import DbConnector
from tabulate import tabulate
from haversine import haversine
from math import sqrt
from pprint import pprint
from datetime import datetime, timedelta


class Queries:

    def __init__(self):
        self.connection = DbConnector()
        self.client = self.connection.client
        self.db = self.connection.db

    def task1(self):
        user_collection = self.db["user"]
        user_count = user_collection.count_documents({})

        activity_collectioon = self.db["activity"]
        activity_count = activity_collectioon.count_documents({})

        track_point_collection = self.db["track_point"]
        track_point_count = track_point_collection.count_documents({})

        pprint(f"Number of users: {user_count}")
        pprint(f"Number of activities: {activity_count}")
        pprint(f"Number of track points: {track_point_count}")

    def task2(self):
        user_collection = self.db["user"]
        user_count = user_collection.count_documents({})

        activity_collectioon = self.db["activity"]
        activity_count = activity_collectioon.count_documents({})

        average = activity_count / user_count

        pprint(f"Average number of activities per user: {average}")

    def task3(self):
        user_collection = self.db["user"]
        result = list(user_collection.aggregate([
            {'$unwind': "$activity_ref"},
            {'$group': {'_id': "$_id", 'activity_ref': {'$push':"$activity_ref"},'size': {'$sum':1}}},
            {'$sort': {'size': -1}},
            {'$limit': 20},
            {'$project': {'_id': 1}}
        ]))

        pprint(result)

    def task4(self):
        user_collection = self.db["user"]
        result = user_collection.aggregate([
            {'$lookup': {'from': 'activity', 'localField': 'activity_ref', 'foreignField': '_id', 'as': 'u_a_join'}},
            {'$unwind': '$u_a_join'},
            {'$match': {'u_a_join.transportation_mode': 'taxi'}},
            {'$project': {'_id': 1}},
            {'$group': {'_id': '$_id'}}
        ])
        pprint("All users that have used a taxi:")
        pprint(list(result))
    
    def task5(self):
        activity_collection = self.db["activity"]

        result = list(activity_collection.aggregate([
            {'$match': {"transportation_mode": {'$ne': None}}},
            {'$group': {'_id': '$transportation_mode', 'count': {'$sum': 1}}},
            {'$sort': {'count': -1}},
        ]))
        pprint(result)

    def task6a(self):
        activity_collection = self.db["activity"]
        result = list(activity_collection.aggregate([
            {'$project': {
                'year': {'$year': '$start_date_time'}
                }
            },
            {'$group': {
                '_id': '$year',
                'count': {'$sum': 1}
                }
            },
            {'$sort': {'count': -1}},
            {'$limit': 1},
        ]))
        pprint(result)

    def task6b(self):
        activity_collection = self.db["activity"]
        result = list(activity_collection.aggregate([
            {'$project': {
                'year': {'$year': '$start_date_time'},
                'start_time': '$start_date_time', 
                'end_time': '$end_date_time'
                }
            },
            {'$group': {'_id': '$year', 
                        'total_hour': {
                            '$sum': {
                                '$dateDiff': {
                                    'startDate': '$start_time', 
                                    'endDate': '$end_time', 
                                    'unit': 'hour'
                                    }
                                }
                            }
                        }
                    }, {
            '$sort': {'total_hour': -1}},
        ]))
        pprint(result)

    def task7(self):
        activity_collection = self.db["activity"]
        result = activity_collection.aggregate([
            {'$project': {'_id': 1, 'user_ref': 1, 'transportation_mode': 1,
                          'start_year': {'$year': '$start_date_time'},
                          'track_point_ref': 1}},
            {'$match': {'user_ref': '112',
                        'transportation_mode': 'walk', 'start_year': 2008}},
            {'$lookup': {'from': 'track_point', 'localField': 'track_point_ref',
                         'foreignField': '_id', 'as': 'tp'}},
            {'$unwind': '$tp'},
            {'$project': {'_id': 1, 'lon': '$tp.lon', 'lat': '$tp.lat'}}
        ])
        rows = list(result)
        aid = rows[0]["_id"]
        activity_distances = []
        activity_dist = 0
        pt0 = (rows[0]["lat"], rows[0]["lon"])
        pt1 = (rows[0]["lat"], rows[0]["lon"])
        for row in rows:
            if aid != row["_id"]:
                aid = row["_id"]
                activity_distances.append(activity_dist)
                activity_dist = 0
                pt1 = (row["lat"], row["lon"])
            pt0 = pt1
            pt1 = (row["lat"], row["lon"])
            activity_dist += haversine(pt0, pt1)

        total_dist = 0
        for dist in activity_distances:
            total_dist += dist

        print(f"Total distance walked by user 112 in 2008 is: {total_dist}km")

    
    def task8(self):
        track_point_collection = self.db['track_point']

        result = list(track_point_collection.aggregate([
            {
                '$addFields': {
                    'all_altitudes': []
                }
            },
            {
                '$group': {
                    '_id': '$activity_ref',
                    'all_altitudes': {'$push': '$altitude'}
                }
            },
            {
                '$project': {
                    'altitude_diff': {
                        '$reduce': {
                            'input': {'$range': [1, {'$size': '$all_altitudes'}]},
                            'initialValue': [],
                            'in':{
                                '$concatArrays': [
                                    '$$value',
                                    [
                                        {
                                            '$cond': {
                                                'if': {
                                                    '$and': [
                                                        {'$ne': [
                                                            '$$this', None]},
                                                        {'$ne': [
                                                            {'$subtract': ['$$this', 1]}, None]}
                                                    ]
                                                },
                                                'then':{
                                                    '$subtract': [
                                                        {'$arrayElemAt': [
                                                            '$all_altitudes', '$$this']},
                                                        {'$arrayElemAt': ['$all_altitudes', {
                                                            '$subtract': ['$$this', 1]}]}
                                                    ]
                                                },
                                                'else': -1
                                            }
                                        }
                                    ]
                                ]
                            }
                        }
                    }
                }
            },
            {
                '$project': {
                    '_id': 0,
                    'activity_id': '$_id',
                    'altitude_sum': {
                        '$reduce': {
                            'input': {'$range': [1, {'$size': '$altitude_diff'}]},
                            'initialValue': {'sum': 0},
                            'in': {
                                'sum': {'$add': ['$$value.sum', {'$cond': {'if': {'$gt': ['$$this', 0]}, 'then': '$$this', 'else': 0}}]}
                            }
                        }
                    }
                }
            },
            {
                '$lookup': {
                    'from': 'user',
                    'localField': 'activity_id',
                    'foreignField': 'activity_ref',
                    'as': 'user'
                }
            },
            {
                '$unwind': '$user'
            },
            {
                '$group': {
                    '_id': '$user._id',
                    'total_meters_gained_per_user': {'$sum': {'$multiply': ['$altitude_sum.sum', 0.3048]}}
                }
            },
            {
                '$sort': {'total_meters_gained_per_user': -1}
            },
            {
                '$limit': 20
            },
            {
                '$project': {
                    '_id': 0,
                    'user_id': '$_id',
                    'total_meters_gained_per_user': 1
                }

            }
        ]))

        pprint(result)

    def task9(self):
        track_point_collection = self.db['track_point']

        activity_date_time = list(track_point_collection.aggregate([
            {
                '$addFields':{
                    'all_date_time': []
                }
            },
            {
                '$group':{
                    '_id': '$activity_ref',
                    'all_date_time': {'$push': '$date_time'}
                }
            },
            {
                '$project':{
                    'all_date_time':{
                        '$sortArray': {'input': '$all_date_time', 'sortBy': 1}
                    }
                }
            }
        ]))
        
        invalid_activities = []

        criteria = timedelta(minutes=5) 

        for activity in activity_date_time:
            
            all_date_time = activity['all_date_time']

            for i in range(1, len(all_date_time)):

                current_tp = all_date_time[i]
                previous_tp = all_date_time[i-1]

                time_diff = current_tp - previous_tp

                if time_diff >= criteria:
                    invalid_activities.append(activity['_id'])
                    break
        
        activity_collection = self.db['activity']

        user_invalid_activites = {}

        for id in invalid_activities:
            result = list(activity_collection.find({'_id': id}))
            
            user_id = result[0]['user_ref']

            if user_id not in user_invalid_activites:
                user_invalid_activites[user_id] = 0
            
            user_invalid_activites[user_id] += 1

        pprint(user_invalid_activites)
    

    def task10(self):
        activity_collection = self.db["activity"]
        result = activity_collection.aggregate([
            {'$lookup': {'from': 'track_point', 'localField': 'track_point_ref', 'foreignField': '_id', 'as': 'tp'}},
            {'$unwind': '$tp'},
            {'$project': {'lat': '$tp.lat', 'lon': '$tp.lon', 'uid': '$user_ref'}},
            {'$match': {'lat': {'$gte': 39.915, '$lte': 39.917}, 'lon': {'$gte': 116.396, '$lte': 116.398}}},
            {'$group': {'_id': '$uid'}}
        ])

        print(f"Number of users that registered activity in the Forbidden City: {len(list(result))}")
    
    def task11(self):
        user_collection = self.db['user']

        result = list(user_collection.aggregate([
            {'$match': {'has_labels':{'$eq': True}}},
            {'$unwind': '$activity_ref'},
            {'$lookup': {'from': 'activity', 'localField': 'activity_ref', 'foreignField': '_id', 'as': 'activity'}},
            {'$unwind': '$activity'},
            {'$match': {'activity.transportation_mode': {'$ne': None}}},
            {'$group': {'_id': {'user': '$_id', 'transportation_mode': '$activity.transportation_mode'},
                        'count': {'$sum': 1}}},
            {'$sort': {'_id.user': 1, 'count': -1}},
            {'$group': {'_id': '$_id.user', 'doc_with_best_count': {'$first': '$$ROOT'}}},
            {'$replaceWith': '$doc_with_best_count'},
            {'$project': {'_id': 0, 'user_id': '$_id.user',
                          'most_used_transportation_mode': '$_id.transportation_mode'}},
            {'$sort': {'user_id':1}}
        ]))

        pprint(result)

        
q = Queries()

q.task9()






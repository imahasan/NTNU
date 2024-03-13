from datetime import datetime, timedelta

a = datetime(2009, 1, 3, 1, 21, 34)
b = datetime(2009, 1, 3, 1, 28, 35)

c = b-a

d = timedelta(minutes=5)

seconds_in_day = 24 * 60 * 60

divmod(c.days * seconds_in_day + c.seconds, 60)

print(c > d)
days = int(input())
year = 0
month = 0
while(days>=365):
    days-=365
    year+=1
while(days>=30):
    days-=30
    month+=1
print("%i ano(s)" % year)
print("%i mes(es)" % month)
print("%i dia(s)" % days)
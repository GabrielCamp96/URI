sec = int(input())
mt=0
hr=0
while(sec>=60):
    sec-=60
    mt+=1
while(mt>=60):
    mt-=60
    hr+=1
print("%i:%i:%i" % (hr,mt,sec))
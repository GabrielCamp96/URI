v = []
i=0
while(i<10):
    x = int(input())
    if(x<=0):
        v.append(1)
    else:
        v.append(x)
    i=i+1
i=0
for j in v:
    print("X[%i] = %i" % (i,j))
    i=i+1
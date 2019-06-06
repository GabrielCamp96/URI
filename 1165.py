i = 0
div = 0
n = int(input())
while(i<n):
    div=0
    j=2;
    x = int(input())
    while(j<x):
        if(x%j==0):
            div=div+1
        j=j+1
    if(div==0):
        print("%i eh primo" % x)
    else :
        print("%i nao eh primo" % x)
    i=i+1
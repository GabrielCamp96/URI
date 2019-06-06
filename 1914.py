n = int(input())
i=0
while(i<n):
    j1,o1,j2,o2 = input().split(' ')
    x,y = input().split(' ')
    x = int(x)
    y = int(y)
    if((x+y)%2==0):
        if(o1 == "PAR"):
            print(j1)
        else:
            print(j2)
    else:
        if(o1 == "IMPAR"):
            print(j1)
        else:
            print(j2)
    i=i+1
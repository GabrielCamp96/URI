par = []
impar = []
i=0
N=15
while(i<N):
    x = int(input())
    if(x%2==0):
        par.append(x)
    else:
        impar.append(x)
    if(len(par)==5):
        j=0
        while(j<5):
            print("par[%i] = %i" % (j,par[j]))
            j=j+1
        par.clear()
    if(len(impar)==5):
        j=0
        while(j<5):
            print("impar[%i] = %i" % (j,impar[j]))
            j=j+1
        impar.clear()
    i=i+1
i=0
for item in impar:
    print("impar[%i] = %i" % (i,item))
    i=i+1
i=0
for item in par:
    print("par[%i] = %i" % (i,item))
    i=i+1
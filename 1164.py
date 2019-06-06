i = 0
n = int(input())
while(i<n):
    soma = 0
    j=1
    x = int(input())
    while(j<x):
        if(x%j==0):
            soma = soma + j
        j=j+1
    if(soma==x):
        print("%i eh perfeito" % x)
    else:
        print("%i nao eh perfeito" % x)
    i=i+1
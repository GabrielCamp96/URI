def triangulo(a,b,c):
    if((a<b+c) and (b<a+c) and (c<b+a)):
        return True
    else:
        return False

n1, n2, n3 = input().split()
n1=float(n1)
n2=float(n2)
n3=float(n3)
if(triangulo(n1,n2,n3)):
    print("Perimetro = %.1f" % (n1+n2+n3))
else:
    print("Area = %.1f" % (((n1+n2)*n3/2)))
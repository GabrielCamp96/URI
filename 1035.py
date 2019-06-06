s = input()
s=s.split()
a = int(s[0])
b = int(s[1])
c = int(s[2])
d = int(s[3])
if((b>c) & (d>a) & ((c+d)>(b+a)) & (c>0) & (d>0) & (a%2==0)):
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
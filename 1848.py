i=0
bin = 0
res=[]
while(i<3):
    s = input()
    if(s != "caw caw" and s != "caw caw "):
        s = s.replace('-','0')
        s = s.replace('*','1')
        bin = bin + int(s,base=2)
    else:
        i=i+1
        res.append(bin)
        bin=0
for item in res:
    print(item)
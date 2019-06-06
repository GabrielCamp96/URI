win = True
x = input()
p,n = x.split(' ')
p = int(p)
n = int(n)
s = input()
s = s.split(' ')
i=1
ini = s.pop(0)
ini = int(ini)
while(i<n):
    prox = s.pop(0)
    prox = int(prox)
    if(abs(prox-ini)>p):
        win = False
    ini = prox
    i=i+1
if(win):
    print("YOU WIN")
else:
    print("GAME OVER")
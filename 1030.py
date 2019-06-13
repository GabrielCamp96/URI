from collections import deque

nc = int(input())
c = 1
while c <= nc:
    n,k = input().split()
    n = int(n)
    k = int(k)
    
    roda = deque(range(1, n + 1))
    chosen = n
    roda.rotate(-chosen)
    while len(roda) > 1:
        roda.rotate(1-k)
        roda.popleft()
    print("Case %i: %i" % (c, roda[0]))
    c = c + 1
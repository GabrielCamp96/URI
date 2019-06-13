from collections import deque

n = 1
final = 13
while n > 0:
    n = int(input())
    rede = deque(range(1, n + 1))
    passo = 0
    while len(rede) > 1:
        cidade = rede.popleft()
        rede.rotate(-passo)
        if cidade == 13 and len(rede) >= 1:
           rede = deque(range(1, n + 1))
           passo = passo + 1
    if n > 0: print(passo+1)
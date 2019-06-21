from collections import deque

n = int(input())
while n != 0:
    top = 0
    data = []
    while n > 0:
        _ = input()
        if len(_) > top: top = len(_)
        data.append(_)
        n-=1
    for i in range(0,len(data)):
        d = deque(data[i])
        while len(d) < top:
            d.appendleft(' ')
        string = ""
        for j in d:
            string += str(j)
        data[i] = string
    for word in data:
        print(word)
    n = int(input())
    if n!=0: print()
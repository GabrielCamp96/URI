from collections import deque
import re

n = int(input())
while n != 0:
    top = 0
    data = []
    while n > 0:
        _ = input()
        match = re.findall('\w+', _)
        res = ""
        i = 0
        while i < len(match) - 1:
            res += match[i] + " "
            i += 1
        res += match[-1]
        if len(res) > top: top = len(res)
        data.append(res)
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
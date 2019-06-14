n = int(input())

while n > 0:
    x, y = input().split()
    limit = len(x) if len(x) <= len(y) else len(y)
    i = 0
    res = ""
    while i < limit:
        res = res + x[i] + y[i]
        i = i + 1
    res = (res + y[limit:]) if (len(x) - limit == 0) else (res + x[limit:])
    print(res)
    n=n-1
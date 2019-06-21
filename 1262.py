while True:
    try:
        data = list(input())
        p = int(input())
        count = 0
        res = 0
        for op in data:
            if op == 'R':
                count+=1
                if count == 1:
                    res +=1
                if count == p:
                    count = 0
            else:
                res +=1
                count = 0
        print(res)
    except EOFError:
        break
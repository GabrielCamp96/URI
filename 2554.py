while True:
    try:
        n,m = input().split()
        n = int(n)
        m = int(m)
        i=0
        datashow="none"
        while(i<m):
            count = 0
            s = input().split()
            data = s.pop(0)
            for pessoa in s:
                if(pessoa == "1"):
                    count = count+1
            if(len(s) == count and datashow=="none"):
                datashow=data
            i=i+1
        if(datashow != "none"):
            print(datashow)
        else:
            print("Pizza antes de FdI")
    except EOFError:
        break
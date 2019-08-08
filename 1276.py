while True:
    try:
        data = list(set(input()))
        res = []
        string = []
        data.sort()
        for letter in data:
            if letter == ' ': continue
            if len(res) == 0 and len(string) == 0:
                if letter == data[-1]: res.append(letter + ":" + letter)
                else: string.append(letter)
            elif ord(lastletter) == ord(letter)-1:
                if len(string) == 2: del string[1]
                string.append(letter)
                if letter == data[-1]: res.append(string[0] + ":" + string[1])
            else:
                if len(string) == 1: string.append(string[0])
                res.append(str(string[0] + ":" + string[1] + ", "))
                if letter == data[-1]:
                    res.append(str(letter + ":"  + letter))
                else:
                    string = []
                    string.append(letter)
            lastletter = letter
        res.sort()
        out = ""
        for seq in res:
            out += seq
        print(out)
    except EOFError:
        break
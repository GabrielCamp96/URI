# Time Limit Exceeded

def checaTabua(base, altura, tabuas):
    count = 0
    fileiras = 0
    j = 1
    for tabua in tabuas: tabuas[tabuas.index(tabua)] = int(tabua) * 100
    tabuas = sorted(tabuas, reverse=True)
    while len(tabuas) > 1 and count < base:
        if tabuas[0] == altura:
            count += 1
            fileiras += 1
            del tabuas[0]
        elif tabuas[0] > altura:
            del tabuas[0]
        else:
            while j < len(tabuas):
                if tabuas[0] + tabuas[j] == altura:
                    count += 2
                    fileiras += 1
                    del tabuas[0]
                    del tabuas[j-1]
                    j = 1
                else:
                    if j == len(tabuas) - 1:
                        del tabuas[0]
                        j = 1
                    else: j += 1
                    
    if fileiras == base: return str(count)
    else: return "impossivel"



while True:
    try:
        n,m = input().split()
        n = int(n)*100
        m = int(m)*100
        if n == 0 or m == 0: break
        l = int(input())
        q = int(input())
        tabuas = input().split()
        q1 = ""
        q2 = ""
        res = ""
        if n % l == 0 and n // l < q: 
            base = n / 100
            altura = m
            q1 = checaTabua(base, altura, tabuas)
        if m % l == 0 and m // l < q:
            altura = n
            base = m / 100
            q2 = checaTabua(base, altura, tabuas)
        if (q1 == "" and q2 == "") or (q1 == "impossivel" and q2 == "impossivel"):
            print("impossivel")
        else:
            if q1 == "impossivel": res = q2
            else:
                if q2 == "impossivel": res = q1
                else:
                    if int(q2) < int(q1): res = q2
                    else: res = q1
            print(res)
    except EOFError:
        break
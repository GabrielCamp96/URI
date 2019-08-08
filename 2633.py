while True:
    try:
        n = int(input())
        carnes = {}
        res = ""
        while n > 0:
            carne, validade = input().split()
            carnes[int(validade)] = carne 
            n -= 1
        for i in sorted(carnes.keys()):
            res += carnes[i] + " "
        print(res[:-1])
    except EOFError:
        break
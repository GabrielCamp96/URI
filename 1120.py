while True:
    n, valor = input().split()
    if n == "0" and valor == "0": break
    valor = list(valor)
    res = "0"
    for i in valor:
        if i != n:
            res = res + i
        else:
            continue
    print(int(res))
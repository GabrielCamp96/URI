n = int(input())
while n > 0:
    input()
    nomes = input().split()
    listas = input().split()
    reprovados = ""
    i = 0
    for lista in listas:
        presenca = list(lista)
        count = 0
        total = 0
        for registro in presenca:
            if registro == 'M': continue
            if registro == 'P': count += 1
            total += 1
        if total == 0: break
        if count / float(total) < 0.75: reprovados += nomes[i] + " "
        i += 1
    print(reprovados[0:-1])
    n -= 1
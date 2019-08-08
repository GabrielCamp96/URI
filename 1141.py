# Ainda não enviei, mas dará WA, verificar motivo.

while True:
    try:
        n = int(input())
        if n == 0: break
        strings = set([])
        anterior = "1"
        while n > 0:
            atual = input()
            if atual in anterior or anterior in atual:
                strings.add(anterior)
                strings.add(atual)
            anterior = atual
            n -= 1
        print(len(strings))
    except EOFError:
        break
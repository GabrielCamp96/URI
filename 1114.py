signal = False
while not signal:
    password = int(input())
    if password == 2002:
        print('Acesso Permitido')
        signal = True
    else:
        print('Senha Invalida')
while True:
    try:
        texto = input()
        while "_" in texto:
            texto = texto.replace("_", "<i>", 1).replace("_","</i>", 1)
        while "*" in texto:
            texto = texto.replace("*", "<b>", 1).replace("*","</b>", 1)
        print(texto)
    except EOFError:
        break
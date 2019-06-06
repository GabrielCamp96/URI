while True:
    try:
        N = int(input())
        i=0
        j=0
        a = []
        b = []
        res = []
        while(i<N):
            aux1,aux2 = input().split()
            aux2,aux3=aux2.split("=")
            a.append(int(aux1))
            b.append(int(aux2))
            res.append(int(aux3))
            i=i+1
        errou = []
        while(j<N):
            soma = False
            sub = False
            mult = False
            imp = True
            nome,eq,op = input().split()
            eq = int(eq) - 1
            if(a[eq]+b[eq] == res[eq]):
                soma = True
                imp = False
            if(a[eq]-b[eq] == res[eq]):
                sub = True
                imp = False
            if(a[eq]*b[eq] == res[eq]):
                mult = True
                imp = False
            if(op == "+"):
                if(soma == False):
                    errou.append(nome)
            elif(op == "-"):
                if(sub == False):
                    errou.append(nome)
            elif(op == "*"):
                if(mult == False):
                    errou.append(nome)
            else:
                if(imp == False):
                    errou.append(nome)
            j=j+1
        if(len(errou) == N):
            print("None Shall Pass!")
        elif(len(errou) == 0):
            print("You Shall All Pass!")
        else:
            errou.sort()
            i=0
            s=""
            while(i<len(errou)):
                if(i + 1 != len(errou)):
                    s = s + errou[i] + " "
                else:
                    s = s + errou[i]
                i=i+1
            print(s)
            
    except EOFError:
        break
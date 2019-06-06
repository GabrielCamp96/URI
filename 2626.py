def Game(a,b):
    if(a=="pedra" and b=="tesoura"):
        return True
    else:
        if (a=="papel" and b=="pedra"):
            return True
        else:
            if(a=="tesoura" and b=="papel"):
                return True
            else:
                return False

while True:
    try:
        a,b,c=input().split()
        va=False
        vb=False
        vc=False
        if(Game(a,b) or Game(a,c)):
            va=True
        if(Game(b,a) or Game(b,c)):
            vb=True
        if(Game(c,a) or Game(c,b)):
            vc=True
        if((va and vb and vc) or (va and vb) or (va and vc) or (vb and vc) or (a==b and a==c)):
            s="Putz vei, o Leo ta demorando muito pra jogar..."
        else:
            if(va):
                s="Os atributos dos monstros vao ser inteligencia, sabedoria..."
            elif(vb):
                s="Iron Maiden's gonna get you, no matter how far!"
            elif(vc):
                s="Urano perdeu algo muito precioso..."
        print(s)
    except EOFError:
        break
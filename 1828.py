n = int(input())
i=1
while(i<=n):
    s = input()
    a,b=s.split(" ")
    if(a==b):
        print("Caso #%i: De novo!" % i)
    else:
        if(a=="pedra"):
            if(b=="lagarto" or b=="tesoura"):
                print("Caso #%i: Bazinga!" % i)
            else:
                print("Caso #%i: Raj trapaceou!" % i)
        elif(a=="papel"):
            if(b=="pedra" or b=="Spock"):
                print("Caso #%i: Bazinga!" % i)
            else:
                print("Caso #%i: Raj trapaceou!" % i)
                
        elif(a=="tesoura"):
            if(b=="papel" or b=="lagarto"):
                print("Caso #%i: Bazinga!" % i)
            else:
                print("Caso #%i: Raj trapaceou!" % i)
        elif(a=="lagarto"):
            if(b=="Spock" or b=="papel"):
                print("Caso #%i: Bazinga!" % i)
            else:
                print("Caso #%i: Raj trapaceou!" % i)
        elif(a=="Spock"):
            if(b=="tesoura" or b=="pedra"):
                print("Caso #%i: Bazinga!" % i)
            else:
                print("Caso #%i: Raj trapaceou!" % i)
    i=i+1
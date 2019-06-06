x = float(input())
if(x<0 or x>100):
    print("Fora de intervalo")
else:
    if(x<=25):
        print("Intervalo [0,25]")
    else:
        if(x<=50):
            print("Intervalo (25,50]") 
        else:
            if(x<=75):
                print("Intervalo (50,75]")
            else:
                if(x<=100):
                    print("Intervalo (75,100]")
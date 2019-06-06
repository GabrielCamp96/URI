import math
x = float(input())
decimal = (x%1)*100
inteiro = x//1
print("NOTAS:")
for nota in 100,50,20,10,5,2:
    quant = inteiro/nota
    print("%i nota(s) de R$ %i.00" % (quant,nota))
    inteiro = inteiro%nota
print("MOEDAS:")
if(inteiro>0):
    print("%i moeda(s) de R$ 1.00" % inteiro)
else:
    print("0 moeda(s) de R$ 1.00")
for moeda in 50,25,10,5,1:
    quant = decimal/moeda
    print("%i moeda(s) de R$ %.2f" % (quant, moeda/100))
    decimal = decimal%moeda
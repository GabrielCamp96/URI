sal = float(input())
if(sal>0 and sal<=400):
    rj = sal*0.15
    sal = sal + rj
    print("Novo salario: %.2f" % sal)
    print("Reajuste ganho: %.2f" % rj)
    print("Em percentual: 15 %")
elif(sal>400 and sal<=800):
    rj = sal*0.12
    sal = sal + rj
    print("Novo salario: %.2f" % sal)
    print("Reajuste ganho: %.2f" % rj)
    print("Em percentual: 12 %")
elif(sal>800 and sal<=1200):
    rj = sal*0.1
    sal = sal + rj
    print("Novo salario: %.2f" % sal)
    print("Reajuste ganho: %.2f" % rj)
    print("Em percentual: 10 %")
elif(sal>1200 and sal<=2000):
    rj = sal*0.07
    sal = sal + rj
    print("Novo salario: %.2f" % sal)
    print("Reajuste ganho: %.2f" % rj)
    print("Em percentual: 7 %")
elif(sal>2000):
    rj = sal*0.04
    sal = sal + rj
    print("Novo salario: %.2f" % sal)
    print("Reajuste ganho: %.2f" % rj)
    print("Em percentual: 4 %")
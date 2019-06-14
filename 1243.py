import re

#WA 100% apesar que no uDebug dá certo

while True:
    try:
        length = 0
        total = 0
        sentence = input().split()
        for word in sentence:
            test = re.search("^[a-zA-Z]+\.{0,1}", word)
            if  test != None and test.start() == 0 and test.end() == len(word):
                length = length + len(word)
                total = total + 1
                
        if total == 0: mean = 0
        else: mean = length // total
        if mean <= 3: print("250")
        elif mean <= 5: print("500")
        else: print("1000")
    except EOFError:
        break


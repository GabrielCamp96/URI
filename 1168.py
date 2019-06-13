n = int(input())
leds = [6, 2, 5, 5, 4, 5, 6, 3, 7, 6]
while n > 0:
    numero = list(input())
    count = 0
    for digit in numero:
        count = count + leds[int(digit)]
    print(str(count) + " leds")
    n = n - 1
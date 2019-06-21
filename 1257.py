n = int(input())
while n > 0:
    l = int(input())
    data = []
    res = 0
    for i in range(l):
        data.append(list(input()))
        count = 0
        for letter in data[i]:
            res += ord(letter)-65 + i + count
            count += 1
    print(res)
    n-=1
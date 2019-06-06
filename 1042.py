n1, n2, n3 = input().split()

n1 = int(n1)
n2 = int(n2)
n3 = int(n3)

if (n1 < n2 and n1 < n3):
    o1 = n1
    if (n2 < n3):
        o2 = n2
        o3 = n3
    else:
        o2 = n3
        o3 = n2
elif (n2 < n1 and n2 < n3):
    o1 = n2
    if (n1 < n3):
        o2 = n1
        o3 = n3
    else:
        o2 = n3
        o3 = n1
elif (n3 < n1 and n3 < n2):
    o1 = n3
    if (n1 < n2):
        o2 = n1
        o3 = n2
    else:
        o2 = n2
        o3 = n1

print(o1)
print(o2)
print(o3)
print()
print(n1)
print(n2)
print(n3)
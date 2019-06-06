while True:
    try:
        N,Q = input().split()
        N = int(N)
        Q = int(Q)
        i=0
        notas=[]
        while(i<N):
            notas.append(int(input()))
            i=i+1
        notas.sort(reverse=True)
        i=0
        while(i<Q):
            print(notas[int(input())-1])
            i=i+1
    except EOFError:
            break
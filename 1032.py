# RUNTIME ERROR

from collections import deque

def sieve_of_eratosthene(N):

    # Lista de números primos:
    numbers = []

    # Cria-se uma lista referente a todos os inteiros entre 0 e N:
    A = [True] * (N+1)

    # Define os números 0 e 1 como não primos:
    A[0] = A[1] = False

    # Percorra a lista até encontrar o primeiro número primo:
    for value, prime in enumerate(A):

        # O número é primo?
        if prime:

            # Retorna o número primo:
            numbers.append(value)

            # Remova da lista todos os múltiplos do número enontrado:
            for i in range(value**2, N+1, value):
                A[i] = False

    return numbers

n = 1
primos = sieve_of_eratosthene(33000)
while n != 0:
    n = int(input())
    i = 0
    roda = deque(range(1, n + 1))
    chosen = n
    roda.rotate(-chosen)
    while len(roda) > 1:
        k = primos[i]
        roda.rotate(1-k)
        x = roda.popleft()
        i = i + 1
    print(roda[0])

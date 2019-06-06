#include <stdio.h>
#include <math.h>
int main()
{
    int cod, n;
    float p,r=0;
    scanf("%i%i%f", &cod, &n, &p);
    r = n*p;
    scanf("%i%i%f", &cod, &n, &p);
    r += (n*p);
    printf("VALOR A PAGAR: R$ %.2f\n", r);
    return 0;
}
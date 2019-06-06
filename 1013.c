#include <stdio.h>
#include <math.h>
#define PI 3.14159
int main()
{
    int a,b,c,maior;
    scanf("%i%i%i", &a, &b, &c);
    if(a>b && a>c){
        maior = a;
    }
    if(b>a && b>c){
        maior = b;
    }
    if(c>a && c>b){
        maior = c;
    }
    printf("%i eh o maior\n", maior);
    return 0;
}
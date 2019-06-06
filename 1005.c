#include <stdio.h>
#include <math.h>
int main()
{
    double a,b,r=0;
    scanf("%lf", &a);
    if(a<0 || a>10){
        printf("Digite a novamente: ");
        return 0;
    }
    scanf("%lf", &b);
    if(b<0 || b>10){
        printf("Digite b novamente: ");
        return 0;
    }
    r=((3.5*a)+(7.5*b))/11;
    printf("MEDIA = %.5lf\n", r);
    return 0;
}
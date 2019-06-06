#include <stdio.h>
#include <math.h>
int main()
{
    double a,b,c,r=0;
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
    scanf("%lf", &c);
    if(c<0 || c>10){
        printf("Digite b novamente: ");
        return 0;
    }
    r=((a*2)+(b*3)+(c*5))/10;
    printf("MEDIA = %.1lf\n", r);
    return 0;
}
#include <stdio.h>
#include <math.h>
int main()
{
    int n,h;
    double s,r=0;
    scanf("%i", &n);
    scanf("%i", &h);
    scanf("%lf", &s);
    r=h*s;
    printf("NUMBER = %i\nSALARY = U$ %.2lf\n", n,r);
    return 0;
}
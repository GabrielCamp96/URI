#include <stdio.h>
#include <math.h>
#define PI 3.14159
int main()
{
    double a[2],b[2], r;
    scanf("%lf%lf", &a[0],&a[1]);
    scanf("%lf%lf", &b[0],&b[1]);
    r=sqrt((pow((b[0]-a[0]),2))+(pow((b[1]-a[1]),2)));
    printf("%.4lf\n", r);
    return 0;
}
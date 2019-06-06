#include <stdio.h>
#include <math.h>
 
int main() {
 
    double n,li,ls;
    scanf("%lf",&n);
    li=n/log(n);
    ls=1.25506*li;
    printf("%.1lf %.1lf\n", li,ls);
    return 0;
}
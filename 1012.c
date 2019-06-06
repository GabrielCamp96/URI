#include <stdio.h>
#include <math.h>
#define PI 3.14159
int main()
{
    float a,b,c,tri,circ,trap,quad,ret;
    scanf("%f%f%f", &a, &b, &c);
    tri = (a*c)/2;
    circ = PI*pow(c,2);
    trap = ((a+b)*c)/2;
    quad = pow(b,2);
    ret = a*b;
    printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", tri,circ,trap,quad,ret);
    return 0;
}
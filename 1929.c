#include <stdio.h>
#include <math.h>

int main()
{
    int a,b,c,d,count=0;
    scanf("%i %i %i %i", &a,&b,&c,&d);
    if(a>abs(b-c) && a<(b+c)) count++;
    if(a>abs(b-d) && a<(b+d)) count++;
    if(a>abs(c-d) && a<(c+d)) count++;
    if(b>abs(a-c) && b<(a+c)) count++;
    if(b>abs(a-d) && b<(a+d)) count++;
    if(b>abs(c-d) && b<(c+d)) count++;
    if(c>abs(a-b) && c<(a+b)) count++;
    if(c>abs(a-d) && c<(a+d)) count++;
    if(c>abs(b-d) && c<(b+d)) count++;
    if(d>abs(a-b) && d<(a+b)) count++;
    if(d>abs(a-c) && d<(a+c)) count++;
    if(d>abs(b-c) && d<(b+c)) count++;
    if(count >=3) printf("S\n");
    else printf("N\n");
    return 0;
}

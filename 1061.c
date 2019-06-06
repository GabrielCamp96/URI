#include <stdio.h>
#include <math.h>
 
int main() {
    int i=0,pos=0,neg=0,lixo;
    float x=0;
    float media=0;
    while(i<6){
        scanf("%f", &x);
        x>0?pos++:neg++;
        x>0?media+=x:lixo++;
        i++;
    }
    printf("%i valores positivos\n", pos);
    printf("%.1f\n", (media/pos));
    return 0;
}
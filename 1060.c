#include <stdio.h>
 
int main() {
    int i=0,pos=0,neg=0;
    float x=0;
    while(i<6){
        scanf("%f", &x);
        x>0?pos++:neg++;
        i++;
    }
    printf("%i valores positivos\n", pos);
    return 0;
}
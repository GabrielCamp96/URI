#include <stdio.h>
#include <math.h>
 
int main() {
    int i=0,impar=0,par=0;
    int x=0;
    while(i<5){
        scanf("%i", &x);
        x%2==0?par++:impar++;
        i++;
    }
    printf("%i valores pares\n", par);
    return 0;
}
#include <stdio.h>
#include <math.h>
 
int main() {
    int i=0,impar=0,par=0,pos=0,neg=0,lixo;
    int x=0;
    while(i<5){
        scanf("%i", &x);
        x%2==0?par++:impar++;
        x>0?pos++:neg++;
        x==0?neg--:lixo++;
        i++;
    }
    printf("%i valor(es) par(es)\n", par);
    printf("%i valor(es) impar(es)\n", impar);
    printf("%i valor(es) positivo(s)\n", pos);
    printf("%i valor(es) negativo(s)\n", neg);
    return 0;
}
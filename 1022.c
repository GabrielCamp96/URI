#include <stdio.h>
#include <stdlib.h>
#define n 10000
#include <math.h>

int main()
{
    int N, N1[n], N2[n], D1[n], D2[n], RN[n], RD[n], resto, i, RN1[n], RD1[n],RN2[n], RD2[n];
    char OP[n];
    scanf("%i", &N);
    for (i=0; i<N; i++)
    {
        scanf("%i / %i %c %i / %i", &N1[i], &D1[i], &OP[i], &N2[i], &D2[i]);
    }
    for(i=0; i<N; i++)
    {
        switch(OP[i])
        {
        case '+':
            RN1[i] = N1[i]*D2[i]+N2[i]* D1[i];
            RD1[i] = D1[i] * D2[i];
            break;
        case '-':
            RN1[i] = N1[i]*D2[i]-N2[i]* D1[i];
            RD1[i] = D1[i] * D2[i];
            break;
        case '*':
            RN1[i] = N1[i] * N2[i];
            RD1[i] = D1[i] * D2[i];
            break;
        case '/':
            RN1[i] = N1[i] * D2[i];
            RD1[i] = N2[i] * D1[i];
            break;
        }
        RN2[i] = RN1[i];
        RD2[i] = RD1[i];

    }

    for (i=0; i<N; i++)
    {
        resto = RN2[i] % RD2[i];
        while(resto!=0)
        {
            RN2[i]    =  RD2[i];
            RD2[i]    = resto;
            resto = RN2[i] % RD2[i];
        }
        RN[i] = RN1[i]/RD2[i];
        RD[i] = RD1[i]/RD2[i];
        if(RD[i] < 0 ){
          RD[i] *= -1;
          RN[i] *= -1;
        }

        printf("%i/%i = %i/%i\n", RN1[i], RD1[i], RN[i], RD[i]);
    }
    return 0;
}
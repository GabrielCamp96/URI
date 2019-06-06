#include <stdio.h>

int main()
{
    float p1,p2,p3,p4,psub,media;
    scanf("%f %f %f %f", &p1,&p2,&p3,&p4);
    media = (2*p1 + 3*p2 + 4*p3 + p4)/10;
    printf("Media: %.1f\n", media);
    if(media>=7){
        printf("Aluno aprovado.\n");
    } else {
        if(media<5){
            printf("Aluno reprovado.\n");
        } else {
            printf("Aluno em exame.\n");
            scanf("%f", &psub);
            printf("Nota do exame: %.1f\n", psub);
            media = (media + psub)/2;
            if(media>=5){
                printf("Aluno aprovado.\n");
            } else {
                printf("Aluno reprovado.\n");
            }
            printf("Media final: %.1f\n", media);
        }
    }
    return 0;
}
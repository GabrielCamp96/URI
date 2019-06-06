#include <stdio.h>
 
int main() {
    float sal,ir;
    scanf("%f", &sal);
    if(sal>=0&&sal<=2000){
        printf("Isento\n");
    }
    else {
        if(sal>2000){
            if(sal<=3000){
            ir=(sal-2000)*.08;
            }
            else {
                ir=80;
            }
        }
        if(sal>3000){
            if(sal<=4500){
                ir+=(sal-3000)*.18;
            }
            else {
                ir+=1500*.18;
            }
        }
        if(sal>4500){
            ir+=(sal-4500)*.28;
        }
        printf("R$ %.2f\n", ir);
    }
    return 0;
}
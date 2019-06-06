#include <iostream>
#include <iomanip>
#include <math.h>
#define N 100
using namespace std;
 
int main() {
    int i=1,atual,maior=0,pos;
    while(i<=N){
        cin >> atual;
        if(atual>maior){
            maior=atual;
            pos=i;
        }
        i++;
    }
    cout<<maior<<endl<<pos<<endl;
    return 0;
}
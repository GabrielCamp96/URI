#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
    float i=0, j=1,aux=1;
    while(i<=2.1){
        cout<<"I="<<i<<" J="<<j<<endl;
        if(aux==3){
            j-=2.8;
            i+=.2;
            aux=0;
        }
        aux++;
        j++;
    }
    return 0;
}
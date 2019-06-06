#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
    int i=1, j=7,aux=1;
    while(i<=9){
        cout<<"I="<<i<<" J="<<j<<endl;
        if(aux==3){
            i+=2;
            j+=5;
            aux=0;
        }
        aux++;
        j--;
    }
    return 0;
}
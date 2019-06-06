#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
    int i=1, j=7;
    while(i<=9){
        cout<<"I="<<i<<" J="<<j<<endl;
        j==5?i+=2:i=i;
        j==5?j=8:j=j;
        j--;
    }
    return 0;
}
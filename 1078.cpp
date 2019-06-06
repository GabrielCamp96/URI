#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
 
    int i=1,n;
    cin >>n;
    while(i<=10){
        cout << i << " x " << n << " = " << i*n << endl;
        i++;
    }
    return 0;
}
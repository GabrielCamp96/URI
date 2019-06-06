#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
 
    long int n,i=1;
    cin >> n;
    while(i<=n){
        if(i%2==0){
            cout <<fixed<<setprecision(0)<< i <<"^2 = "<<pow(i,2)<<endl;
        }
        i++;
    }
    return 0;
}
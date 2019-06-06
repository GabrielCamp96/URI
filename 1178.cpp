#include <iostream>
#include <iomanip>
#include <math.h>
#define N 100
using namespace std;

int main()
{
    int i=1;
    double n[N],x;
    cin >> x;
    n[0] = x;
    while(i<N){
        n[i] = n[i-1]/2;
        i++;
    }
    i=0;
    while(i<N){
        cout <<fixed<<setprecision(4)<< "N[" << i << "] = " << n[i] << endl;
        i++;
    }
    return 0;
}
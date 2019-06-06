#include <iostream>
#include <iomanip>
#include <math.h>
#define N 61
using namespace std;

int main()
{
    long long int fib[N],i=2,t,x;
    fib[0]=0;
    fib[1]=1;
    while(i<N){
        fib[i] = fib[i-1] + fib[i-2];
        i++;
    }
    i=0;
    cin >> t;
    while(i<t){
        cin >> x;
        cout <<fixed<<setprecision(0)<<"Fib("<<x<<") = "<<fib[x] << endl;
        i++;
    }
    return 0;
}
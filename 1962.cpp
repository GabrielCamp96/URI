#include <iostream>
#include <math.h>
#include <iomanip>
#define N 2015
using namespace std;

int main()
{
    long long int n,x,i=0;
    cin >> n;
    while(i<n){
        cin >> x;
        if(x>=N){
            if(x==N) cout << "1 A.C." << endl;
            else cout << abs(x-N+1) << " A.C." << endl;
        }
        else cout <<fixed<<setprecision(0)<< abs(N-x) << " D.C." << endl;
        i++;
    }
    
    return 0;
}

#include <iostream>
#include <iomanip>
#include <math.h>
#define N 1000
using namespace std;

int main()
{
    short t,n[N],i=0,j=0;
    cin >> t;
    while(i<N){
        if(j==t){
            j=0;
        }
        n[i] = j;
        j++;
        i++;
    }
    i=0;
    while(i<N){
        cout << "N[" << i << "] = "<< n[i] << endl;
        i++;
    }
    return 0;
}
#include <iostream>
#include <iomanip>
#include <math.h>
#define N 20
using namespace std;

int main()
{
    int n[N],i=0,aux;
    while(i<N){
        cin >> n[i];
        i++;
    }
    i=0;
    while(i<round(N/2)){
        aux = n[i];
        n[i] = n[(N-1)-i];
        n[(N-1)-i] = aux;
        i++;
    }
    i=0;
    while(i<N){
        cout << "N[" << i << "] = " << n[i] << endl;
        i++;
    }
    return 0;
}
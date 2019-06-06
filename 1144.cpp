#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main()
{
    long int n,i=1;
    cin >> n;
    while (i<=n){
        cout <<fixed<<setprecision(0)<< pow(i,1) << " " << pow(i,2) << " " << pow(i,3) << endl;
        cout <<fixed<<setprecision(0)<< pow(i,1) << " " << pow(i,2)+1 << " " << pow(i,3)+1 << endl;
        i++;
    }
    return 0;
}
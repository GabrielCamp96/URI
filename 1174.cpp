#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int i=0;
    double a[100];
    while(i<100){
        cin >> a[i];
        i++;
    }
    i=0;
    while(i<100){
        if(a[i]<=10){
            cout <<fixed<<setprecision(1)<< "A[" << i << "] = " << a[i] << endl;
        }
        i++;
    }

    return 0;
}
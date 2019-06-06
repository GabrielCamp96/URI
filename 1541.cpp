#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a,b,c,area,areat,l;
    while(1){
        cin >> a;
        if(a==0) break;
        cin >> b >> c;
        area = a*b;
        areat = area*100/c;
        l=sqrt(round(areat));
        cout << l << endl;
    }
    return 0;
}

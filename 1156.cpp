#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main()
{
    double i,b=1,x,soma=0;
    for(i=1; i<=39; i+=2)
    {
        x=i/b;
        soma+=x;
        b*=2;
    }
    cout << fixed << setprecision(2) << soma << endl;
    return 0;
}
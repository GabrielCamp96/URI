#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main()
{
    double x,y,t;
    cin >> x >> y;
    t = (y*100/x)-100;
    cout << fixed << setprecision(2) << t << "%" << endl;
    return 0;
}

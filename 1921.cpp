#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    long long int n,d;
    cin >> n;
    d = n*(n-3)/2;
    cout <<fixed<<setprecision(0)<< d << endl;
    return 0;
}

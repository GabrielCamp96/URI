#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    long double x;
    cin >> x;
    cout << showpos << uppercase << setprecision(4) << scientific << x << endl; 
}
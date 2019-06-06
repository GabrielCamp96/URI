#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main()
{
    int n,i=1;
    cin >> n;
    while (i<=n){
        cout << pow(i,1) << " " << pow(i,2) << " " << pow(i,3) << endl;
        i++;
    }
    return 0;
}

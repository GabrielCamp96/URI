#include <iostream>

using namespace std;

int main()
{
    short a,b;
    cin >> a >> b;
    if(a==b) cout << a << endl;
    else{
        if(a>b) cout << a << endl;
        else cout << b << endl;
    }
}

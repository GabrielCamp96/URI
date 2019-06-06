#include <iostream>

using namespace std;

int main()
{
    int x,v[10],i=1;
    cin >> x;
    v[0] = x;
    while(i<10){
        v[i]=2*v[i-1];
        i++;
    }
    i=0;
    while(i<10){
        cout << "N[" << i << "] = " << v[i] << endl;
        i++;
    }
    return 0;
}
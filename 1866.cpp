#include <iostream>

using namespace std;

int main()
{
    int i=0,n,x;
    cin >> n;
    while(i<n){
        cin >> x;
        if(x%2==0) cout << 0 << endl;
        else cout << 1 << endl;
        i++;
    }
    return 0;
}

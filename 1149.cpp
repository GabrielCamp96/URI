#include <iostream>

using namespace std;

int main()
{
    int i=0,x,n,A=0;
    cin >> x;
    cin >> n;
    while(n<=0){
        cin >> n;
    }
    while(i<n){
        A += (x+i);
        i++;
    }
    cout << A << endl;
    return 0;
}

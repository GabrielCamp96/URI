#include <iostream>

using namespace std;

int main()
{
    int i,n;
    bool test=true;
    while (test){
        cin >> n;
        if(n==0){
            test=false;
        } else {
            i=1;
            while(i<n){
                cout << i << " ";
                i++;
            }
            cout << i << endl;
        }
    }
    return 0;
}
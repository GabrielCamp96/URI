#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int i=0,n,soma=1;
    cin >> n;
    while(i<n){
        cout << soma << " " << soma+1 << " " << soma+2 << " " << "PUM" << endl;
        soma+=4;
        i++;
    }
    return 0;
}
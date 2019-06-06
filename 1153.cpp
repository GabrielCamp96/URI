#include <iostream>

using namespace std;

int main()
{
    int i=0,n,fat=1;
    cin>>n;
    while(i<n){
        fat*=(n-i);
        i++;
    }
    cout << fat << endl;

    return 0;
}

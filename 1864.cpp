#include <iostream>

using namespace std;

int main()
{
    char v[34] = {'L','I','F','E',' ','I','S',' ','N','O','T',' ','A',' ','P','R','O','B','L','E','M',' ','T','O',' ','B','E',' ','S','O','L','V','E','D'};
    int n,i=0;
    cin >> n;
    while(i<n){
        cout << v[i];
        i++;
    }
    cout << endl;
    return 0;
}
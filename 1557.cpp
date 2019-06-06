#include <iostream>
#include <math.h>
#include <string.h>
#include <iomanip>

using namespace std;

int main()
{
    int n,i,j,x;
    while(1){
        string T = "";
        cin >> n;
        int a[n][n],prod=1,count=0;
        if(n==0) break;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=prod;
                prod*=2;
            }
            prod=a[i][1];
        }
        T=to_string(a[n-1][n-1]);
        count = T.size();
        for(i=0;i<n;i++){
            cout << setw(count);
            for(j=0;j<n-1;j++){
                cout  << setw(count) << a[i][j]<<  " ";
            }
            cout << setw(count)<< a[i][n-1] << endl;
        }
        cout << endl;
    }
    
    return 0;
}
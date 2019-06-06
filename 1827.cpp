#include <iostream>

using namespace std;

int main()
{
    int n,i,j;
    while(scanf("%i", &n) != EOF){
        int a[n][n],l1,l2;
        l1=n/3;
        l2=2*n/3;
        if(n%3 == 0) l2--;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j) a[i][j] = 2;
                else {
                    if(j+i==n-1) a[i][j] = 3;
                    else a[i][j] =0;  
                }
            }
        }
        for(i=l1;i<=l2;i++){
            for(j=l1;j<=l2;j++){
                if(i==n/2 && j==n/2) a[i][j] = 4;
                else a[i][j] = 1;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                cout << a[i][j];
            }
            cout << endl;
        }
        cout << endl;
    }
    return 0;
}
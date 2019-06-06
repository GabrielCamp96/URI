#include <iostream>
#include <iomanip>
#define N 12

using namespace std;

int main()
{
    double m[N][N],x=0;
    int l,i=0,j=0;
    char op;
    cin >> l;
    cin >> op;
    while(i<N){
        while(j<N){
            cin >> m[i][j];
            j++;
        }
        j=0;
        i++;
    }
    switch(op){
        case 'S':
            while(j<N){
                x+=m[l][j];
                j++;
            }
            break;
        case 'M':
            while(j<N){
                x+=m[l][j];
                j++;
            }
            x/=N;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
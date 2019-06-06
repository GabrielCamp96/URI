#include <iostream>
#include <iomanip>
#define N 12

using namespace std;

int main()
{
    double m[N][N],x=0;
    int c,i=0,j=0;
    char op;
    cin >> c;
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
                x+=m[j][c];
                j++;
            }
            break;
        case 'M':
            while(j<N){
                x+=m[j][c];
                j++;
            }
            x/=N;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
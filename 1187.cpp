#include <iostream>
#include <iomanip>
#include <math.h>
#define N 12

using namespace std;

int main()
{
    double m[N][N],x=0;
    int i=0,j=0,count=0;
    char op;
    cin >> op;
    while(i<N){
        while(j<N){
            cin >> m[i][j];
            j++;
        }
        j=0;
        i++;
    }
    j=1;
    i=0;
    switch(op){
        case 'S':
            while(i<round(N/2)){
                while(j<(N-i-1)){
                   x+=m[i][j];
                   j++;
                }
                i++;
                j=i+1;
            }
            break;
        case 'M':
            while(i<round(N/2)){
                while(j<(N-i-1)){
                   x+=m[i][j];
                   j++;
                   count++;
                }
                i++;
                j=i+1;
            }
            x/=count;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
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
    j=0;
    i=1;
    switch(op){
        case 'S':
            while(j<round((N-1)/2)){
                while(i<N-1-j){
                   x+=m[i][j];
                   i++;
                }
                i=j+2;
                j++;
            }
            break;
        case 'M':
            while(j<round((N-1)/2)){
                while(i<N-1-j){
                   x+=m[i][j];
                   i++;
                   count++;
                }
                i=j+2;
                j++;
            }
            x/=count;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
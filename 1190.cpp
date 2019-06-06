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
    j=N-1;
    i=1;
    switch(op){
        case 'S':
            while(j>round((N-1)/2)){
                while(i<j){
                   x+=m[i][j];
                   i++;
                }
                j--;
                i=N-j;
            }
            break;
        case 'M':
            while(j>round((N-1)/2)){
                while(i<j){
                   x+=m[i][j];
                   i++;
                   count++;
                }
                j--;
                i=N-j;
            }
            x/=count;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
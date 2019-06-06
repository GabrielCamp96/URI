#include <iostream>
#include <iomanip>
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
    i=0;
    switch(op){
        case 'S':
            while(i<N){
                while(j<i){
                   x+=m[i][j];
                   j++;
                }
                j=0;
                i++;
            }
            break;
        case 'M':
            while(i<N){
                while(j<i){
                   x+=m[i][j];
                   j++;
                   count++;
                }
                j=0;
                i++;
            }
            x/=count;
            break;
    }
    cout <<fixed<<setprecision(1)<< x << endl;
    return 0;
}
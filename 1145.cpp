#include <iostream>
#include <iomanip>
#include <math.h>

using namespace std;

int main()
{
    int x,y,i=0,j,soma=0;
    cin >> x >> y;
    while(i<y){
        j=1;
        while(j<x){
            if((soma+1)==y){
                j=x;
            } else {
                soma++;
                cout <<fixed<<setprecision(0)<< soma << " ";
                j++;
            }
        }
        soma++;
        cout <<fixed<<setprecision(0)<< soma << endl;
        i+=x;
    }
    return 0;
}

#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int x,y,soma=0,aux;
    cin >> x >> y;
    if (x>y){
        aux = y;
        y=x;
        x = aux;
    }
    while (x<=y){
        x%13!=0?soma+=x:aux++;
        x++;
    }
    cout<<soma<<endl;
    return 0;
}

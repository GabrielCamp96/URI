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
    if(x%5==2 || x%5==3){
        x++;
    }
    while(x<y){
        if(x%5==2 || x%5==3){
            cout << x << endl;
        }
        x++;
    }
    return 0;
}
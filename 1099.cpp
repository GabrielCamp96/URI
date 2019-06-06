#include <iostream>

using namespace std;

int main()
{
    int n,x,y,soma=0,i=0,aux;
    cin >> n;
    while(i<n){
        cin >> x >> y;    
        if(x>y){
            aux = y;
            y = x;
            x = aux;
        }
        while(x<y){
            x++;
            x%2==1?soma+=x:soma;
            (x==y && y%2==1)?soma-=x:soma;
        }
        cout << soma << endl;
        soma=0;
        i++;
    }
    return 0;
}

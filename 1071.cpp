#include <iostream>
 
using namespace std;
 
int main() {
 
    int x,y,aux,soma=0;
    cin >> x;
    cin >> y;
    if(x>y){
        aux = y;
        y=x;
        x=aux;
    }
    while((x+1)<y){
        x++;
        if(x%2==1 || x%2==-1){
            soma+=x;  
        }
    }
    cout << soma << endl;
    return 0;
}
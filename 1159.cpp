#include <iostream>
using namespace std;

int main()
{
    int x,par=0,soma=0;
    cin >> x;
    while(x!=0){
        while(par<5){
            if(x%2==0){
                soma+=x;
                par++;    
            }
            x++;
        }
        cout << soma << endl;
        soma = 0;
        par = 0;
        cin >> x;
    }
    return 0;
}

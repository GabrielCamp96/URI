#include <iostream>

using namespace std;

int main()
{
    int n,i=3,ant=1,prox=1,aux;
    cin>>n;
    if(n==1){
        cout << 0 << endl;;
    }
    else {
        if(n==2){
            cout << 0 << " " << 1 << endl;
        }
        else {
            cout << 0 << " " << 1 <<" ";
            while(i<n){
                cout << prox << " ";
                aux=prox;
                prox = prox+ant;
                ant = aux;
                i++;
            }
            cout << prox << endl;
        }
    }

    return 0;
}
#include <iostream>

using namespace std;

int main()
{
    int n,inscr,i=0,iaux;
    double nota,aux=7.9;
    cin >> n;
    while(i<n){
        cin >> inscr >> nota;
        if(nota>aux){ 
            aux = nota;
            iaux=inscr;
        }
        i++;
    }
    if(aux>=8) cout << iaux << endl;
    else cout << "Minimum note not reached" << endl;
    

    return 0;
}
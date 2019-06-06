#include <iostream>

using namespace std;

int main()
{
    int i=0,n,aux=21,pos;
    cin >> n;
    int v[n];
    while(i<n){
        cin >> v[i];
        if(aux>v[i]){
            pos=i;
            aux=v[i];
        }
        i++;
    }
    cout << pos+1 << endl;

    return 0;
}

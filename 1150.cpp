#include <iostream>

using namespace std;

int main()
{
    int x,z,count=1,soma;
    cin >> x;
    soma = x;
    cin >> z;
    while(z<=x){
        cin >> z;
    }
    while(soma<=z){
        soma+=(x+count);
        count++;
    }
    cout << count << endl;
    return 0;
}

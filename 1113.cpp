#include <iostream>

using namespace std;

int main()
{
    int x,y;
    while(1){
        cin >> x >> y;
        if(x==y){
            break;
        } else {
            if(x<y){
                cout << "Crescente\n";
            } else {
                cout << "Decrescente\n";
            }
        }
    }

    return 0;
}

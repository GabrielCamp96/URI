#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double x,y;
    int n,i=0;
    cin >> n;
    while(i<n){
        cin >> x >> y;
        if(y==0){
            cout << "divisao impossivel" << endl;
        }
        else {
            cout <<fixed<<setprecision(1)<< x/y << endl;
        }
        i++;
    }

    return 0;
}

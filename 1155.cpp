#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double soma=0,i=0;
    for(i=1;i<=100;i++){
        soma+=(1/i);
    }
    cout << fixed << setprecision(2) << soma << endl;
    return 0;
}
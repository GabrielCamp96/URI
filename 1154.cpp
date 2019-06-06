#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int count=0,n;
    double media=0;
    cin>>n;
    while(n>=0){
        media+=n;
        count++;
        cin>>n;
    }
    cout << fixed << setprecision(2) << (media/count) << endl;
    return 0;
}
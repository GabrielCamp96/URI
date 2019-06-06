#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int t,pa,pb,i=0,anos;
    double g1,g2;
    cin >> t;
    while(i<t){
        anos=0;
        cin >> pa >> pb >> g1 >> g2;
        while(pa<=pb && anos<101){
            pa+=(pa*(g1/100));
            pb+=(pb*(g2/100));
            anos++;
        }
        if(anos>100){
            cout << "Mais de 1 seculo." << endl;
        }
        else{
            cout << anos << " anos." << endl;
        }
        i++;
    }
    return 0;
}
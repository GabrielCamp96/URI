#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
    int n,q,i=0,tcob=0,tc=0,tr=0,ts=0;
    char cob;
    cin >> n;
    while(i<n){
        cin >> q >> cob;
        tcob+=q;
        if(cob=='C'){
            tc+=q;
        }
        if(cob=='S'){
            ts+=q;
        }
        if(cob=='R'){
            tr+=q;
        }
        i++;
    }
    cout << "Total: " << tcob << " cobaias" << endl;
    cout << "Total de coelhos: " << tc << endl;
    cout << "Total de ratos: " << tr << endl;
    cout << "Total de sapos: " << ts << endl;
    cout << fixed << setprecision(2) <<"Percentual de coelhos: " << ((float)(tc*100)/(float)(tcob)) << " %" << endl;
    cout << fixed << setprecision(2) <<"Percentual de ratos: " << ((float)(tr*100)/(float)(tcob)) << " %" << endl;
    cout << fixed << setprecision(2) <<"Percentual de sapos: " << ((float)(ts*100)/(float)(tcob)) << " %" << endl;
    
    return 0;
}
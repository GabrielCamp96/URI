#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
 
    long int n,i=0,x[N];
    string s[N];
    cin >> n;
    while(i<n){
        cin >> x[i];
        if(x[i]%2==0){
            s[i]="EVEN ";
        }
        else{
            s[i]="ODD ";
        }
        if(x[i]>0){
            s[i]+="POSITIVE\n";
        }
        else{
            s[i]+="NEGATIVE\n";
        }
        if(x[i]==0){
            s[i]="NULL\n";
        }
        i++;
    }
    i=0;
    while(i<n){
        cout << s[i];
        i++;
    }
    return 0;
}
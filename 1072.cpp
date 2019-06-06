#include <iostream>
#define N 10000
using namespace std;
 
int main() {
 
    long int x[N];
    int i=0,n,in=0,out=0;
    cin >> n;
    while(i<n){
        cin >> x[i];
        (x[i]>=10 && x[i]<=20)?in++:out++;
        i++;
    }
    cout << in << " in" << endl;
    cout << out << " out" << endl;
    return 0;
}
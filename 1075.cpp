#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
 
    int n,i=1;
    string s;
    cin >> n;
    while(i<=10000){
        if(i%n==2){
            cout<<i<<endl;
        }
        i++;
    }
    return 0;
}
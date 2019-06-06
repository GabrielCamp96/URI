#include <iostream>
#include <iomanip>
#include <math.h>
#define N 10000
using namespace std;
 
int main() {
 
    int n,i=0;
    float x,y,z,media[N];
    cin >> n;
    while(i<n){
        cin >> x >> y >> z;
        media[i]=(2*x + 3*y + 5*z)/10;
        i++;
    }
    i=0;
    while(i<n){
        cout << fixed <<setprecision(1) <<media[i] << endl;
        i++;
    }
    return 0;
}
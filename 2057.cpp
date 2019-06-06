#include <iostream>

using namespace std;

int main()
{
    int c,d,f,r=0;
    cin>>c>>d>>f;
    r=c+d+f;
    while(r>=24) r-=24;
    while(r<0) r+=24;
    cout<<r<<endl;
    return 0;
}
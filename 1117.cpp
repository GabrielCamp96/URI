#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double in,x,y;
    bool test=true;
    while(test){
        cin >> in;
        if(in<0 || in>10){
            cout << "nota invalida"<<endl; 
        }
        else {
            x = in;
            test=false;
        }
    }
    test=true;
    while(test){
        cin >> in;
        if(in<0 || in>10){
            cout << "nota invalida"<<endl;
        }
        else {
            y=in;
            test=false;
        }    
    }
    cout<<fixed<<setprecision(2)<< "media = " << (x+y)/2 << endl;

    return 0;
}

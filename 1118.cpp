#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double in,x,y,op=1;
    bool test;
    while(op==1){
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
        test=true;
        while(test){
            cout<<"novo calculo (1-sim 2-nao)" << endl;
            cin >> op;
            if(op==1 || op==2){
                test = false;
            }
        }
        test=true;
    }
    return 0;
}

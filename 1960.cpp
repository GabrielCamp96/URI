#include <iostream>

using namespace std;

int main()
{
    int x,aux,i;
    string s="";
    string c[9] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    string d[9] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    string u[9] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    cin >> x;
    if(x==1000) s = "M";
    else{
        if(x>=100){
            aux = x / 100;
            x = x % 100;
            s += c[aux-1];
        }
        if(x>=10){
            aux = x / 10;
            x = x % 10;
            s += d[aux - 1];
        }   
        if(x>=1){
            aux = x;
            x = 0;
            s += u[aux - 1];
        }
    }
    cout << s << endl;
    return 0;
}
#include <iostream>
#include <math.h>

using namespace std;


int main()
{
    int hi,hf,tempo;
    cin >> hi >> hf;
    if(hi==hf){
        cout << "O JOGO DUROU 24 HORA(S)" << endl;
    }
    else{
        if(hi>12){
            hi-=12;
        }
        if(hf>12){
            hf-=12;
        }
        tempo = abs(hf+12-hi);
        cout << "O JOGO DUROU "<<tempo<<" HORA(S)" << endl;
    }
    return 0;
}
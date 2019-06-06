#include <iostream>
#include <math.h>

using namespace std;


int main()
{
    int hi,mi,hf,mf,hora,minuto;
    cin >> hi >> mi >> hf >> mf;
    if(hi==hf){
        if(mi==mf){
            cout<<"O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)" << endl;
        }
        if(mi<mf){
            cout<<"O JOGO DUROU 0 HORA(S) E "<<mf-mi<<" MINUTO(S)" << endl;
        }
        if(mi>mf){
            cout<<"O JOGO DUROU 23 HORA(S) E "<<mf+60-mi<<" MINUTO(S)" << endl;
        }
    }
    if(hi < hf){
        if(mi==mf){
            cout<<"O JOGO DUROU "<<hf-hi<<"HORA(S) E 0 MINUTO(S)" << endl;
        }
        if(mi<mf){
            cout<<"O JOGO DUROU "<<hf-hi<<" HORA(S) E "<<mf-mi<<" MINUTO(S)"<< endl;
        }
        if(mi>mf){
            cout<<"O JOGO DUROU "<<hf-hi-1<<" HORA(S) E "<<mf+60-mi<<" MINUTO(S)"<< endl;
        }
    }
    if(hi > hf){
        if(mi==mf){
            cout<<"O JOGO DUROU "<<hf+24-hi<<"HORA(S) E 0 MINUTO(S)" << endl;
        }
        if(mi<mf){
            cout<<"O JOGO DUROU "<<hf+24-hi<<" HORA(S) E "<<mf-mi<<" MINUTO(S)"<< endl;
        }
        if(mi>mf){
            cout<<"O JOGO DUROU "<<hf+23-hi<<" HORA(S) E "<<mf+60-mi<<" MINUTO(S)"<< endl;
        }
    }
    return 0;
}

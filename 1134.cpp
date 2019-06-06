#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int in,gas=0,alc=0,die=0;
    bool test=true;
    cout << "MUITO OBRIGADO" << endl;
    while(test){
        cin >> in;
        switch(in){
            case 1:
                alc++;
                break;
            case 2:
                gas++;
                break;
            case 3:
                die++;
                break;
            case 4:
                test=false;
                break;
            default:
                break; 
        }
    }
    cout << "Alcool: " << alc << endl;
    cout << "Gasolina: " << gas << endl;
    cout << "Diesel: " << die << endl;
    return 0;
}

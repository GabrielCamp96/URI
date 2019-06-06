#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int inter=0,gremio=0,draw=0,op=1,x,y;
    while(op==1){
        cin >> x >> y;
        if(x==y){
            draw++;
        } else {
            if(x>y){
                inter++;
            } else {
                gremio++;
            }
        }
        cout << "Novo grenal (1-sim 2-nao)" << endl;
        cin >> op;
    }
    cout << (inter+gremio+draw) << " grenais" << endl;
    cout << "Inter:" << inter << endl;
    cout << "Gremio:" << gremio << endl;
    cout << "Empates:" << draw << endl;
    if(inter == gremio){
        cout << "Nao houve vencedor" << endl;
    } else {
        if (inter > gremio){
            cout << "Inter venceu mais" << endl;
        }
        else {
            cout << "Gremio venceu mais" << endl;
        }
    }
    return 0;
}

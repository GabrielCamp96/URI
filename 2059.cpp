#include <iostream>

using namespace std;

int main()
{
    int p,j1,j2,r1,r2;
    cin>>p>>j1>>j2>>r1>>r2;
    if(r1==1 && r2==1) cout << "Jogador 2 ganha!" << endl;
    else if((r1==1 && r2==0) || (r1==0 && r2==1)) cout << "Jogador 1 ganha!" << endl;
         else{
             j1+=j2;
             if((j1%2==0 && p==1) || (j1%2==1 && p==0)) cout << "Jogador 1 ganha!" << endl;
             else cout << "Jogador 2 ganha!" << endl;
         }
    return 0;
}

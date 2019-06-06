#include <iostream>
 
using namespace std;
 
int main() {
 
    unsigned int n,m,o,t,x,y,op,count,aux;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> m;
        int v[m][60];
        for(int a=0;a<m;a++)
            for(int b=0;b<60;b++) v[a][b]=0;
        for(int j=0;j<m;j++){
            cin >> o;
            for(int k=0;k<o;k++){
                cin >> aux;
                v[j][aux-1] = 1;
            }
        }
        cin >> t;
        for(int l=0;l<t;l++){
            count=0;
            cin >> op >> x >> y;
            if(op==1){
                for(int a=0;a<60;a++){
                        if((v[x-1][a] & v[y-1][a])==1){
                            count++;
                        }
                }
            }
            else{
                for(int a=0;a<60;a++){
                        if((v[x-1][a] | v[y-1][a]) == 1){
                            count++;
                        }
                }
            }
            cout << count <<endl;
        }
        
    }
 
    return 0;
}
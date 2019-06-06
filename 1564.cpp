#include <iostream>

using namespace std;

int main()
{
    int n;
    while(scanf("%i", &n) != EOF){
        if(n==0) cout << "vai ter copa!" << endl;
        else cout << "vai ter duas!" << endl;
    }
    return 0;
}
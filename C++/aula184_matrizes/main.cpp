#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int N, i, j, cont=0;

    cout << " Qual a ordem da matriz: ";
    cin >> N;

    int mat[N][N];

    for(i=0; i<N; i++){
        for(j=0; j<N; j++){
            cout << "Elemento [" << i << "," << j << "]:" ;
            cin >> mat[i][j];
            cout << endl;
        }
    }

    cout << "DIAGONAL PRINCIPAL: ";
    for(i=0; i<N; i++){
        cout << mat[i][i] << " ";
    }
    cout << endl;


    for(i=0; i<N; i++){
        for(j=0; j<N; j++){
            if(mat[i][j] < 0 ){
                cont = cont+1;
            }
        }
    }
    cout << " QUANTIDADE DE NEGATIVOS: " << cont ;
    return 0;
}

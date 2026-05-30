#include<iostream>
#include<vector>

using namespace std;

void MoveZeroes(vector<int> &arr , int n){
    int a = 0;

    for(int  i = 0 ; i<n-1 ; i++){
        if(arr[i] == 0){
            a = i ;
            break;
        }
    }

    cout<<"Xeroes Index : "<<a <<endl;

    for(int i = 0+a; i< n ; i++){
        if(arr[i] != 0){
            swap(arr[a++] , arr[i]);
        }
    }


    for(int row: arr){
        cout<<row << " ";
    }

}

int main(){
    vector<int> arr = {2 ,0, 4, 1, 3, 0, 28};

    MoveZeroes(arr ,  arr.size());

    return 0;
}


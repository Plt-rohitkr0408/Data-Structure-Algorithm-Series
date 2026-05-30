#include<iostream>
#include<vector>
using namespace std;

vector<int> BubbleSort(vector<int> &arr , int size){
    for(int i = 0 ; i< size-1 ; i++){
        for(int j = 0; j< size ; j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j] , arr[j+1]) ;
            }
        }
    }

    return arr ;
}

void printFunc(vector<int> &vec ){
    for(int row: vec){
        cout<< row <<" ";
    }
}

int main(){
    vector<int> vec = { 10 , 1 , 7 , 6 , 14 , 9};

    int size = vec.size();

    BubbleSort(vec, size);
    printFunc(vec);

    return 0;
}
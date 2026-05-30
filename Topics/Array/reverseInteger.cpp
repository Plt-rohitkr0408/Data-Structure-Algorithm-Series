#include<iostream>
using namespace std;


int Reverse(int x){
    int revnum = 0;

    while(x >= 0 ){
        revnum = revnum * 10 + x %10 ;
        x = x / 10 ;
    }
    return revnum ;
}

int main(){
    int n = 1234;
    cout<< Reverse(n);
    return 0;
}



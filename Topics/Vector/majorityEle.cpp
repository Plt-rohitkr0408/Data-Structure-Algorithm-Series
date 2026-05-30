#include<iostream>
#include<vector>
using namespace std;

int MajorityElement(vector<int> &vec){
    int num = vec.size();

    for(int val : vec){
        int count = 0;
        for(int val2 : vec){
            if(val2 == val){
                count++ ;
            }
        }
        if(count >= num/2){
            return val;
        }
    }

}

int main(){
    vector<int> vec = { 3 , 2 , 3 , 2 , 4 ,  5 , 8};
    int num = MajorityElement(vec);

    cout<<"Majority ELements "<<num;
    return 0;
}
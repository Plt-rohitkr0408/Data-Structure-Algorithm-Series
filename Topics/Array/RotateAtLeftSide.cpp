

#include <iostream>
#include <vector>

using namespace std;


void RotateAtLeftSide(vector<int> &arr, int n)
{
    int s = 0;
    int e = arr.size()-1;

    for(int i = 0 ; i< n;i++){
        int temp  = arr[0];
        while(s <=e){
            arr[s] = arr[s+1];
            s++;
        }
        arr[e] = temp ;
        s = 0;
    }
}

int main()
{

    vector<int> arr = {1, 2, 3, 4, 8, 9};
    cout<< "Before Rotate "<<endl;
    for(int r: arr){
        cout<<r<<" ";
    }
    cout<<endl;

    RotateAtLeftSide(arr, 2);
    cout<<"After Rotate"<<endl;
    for (int row : arr)
    {
        cout << row << " ";
    }
    cout << endl;
    cout << endl;
    cout << "Ache Se Work kr rha ha !!";

    return 0;
}
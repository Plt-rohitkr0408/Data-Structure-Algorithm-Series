
#include <iostream>
#include <vector>

using namespace std;

void RotateForwardAndBackWard(vector<int> &arr, char c, int k)
{
    int s = 0;
    int e = arr.size() - 1;

    if (c == 'f')
    {
        for (int i = 0; i < k; i++)
        {
            int temp = arr[e];
            while (s <= e)
            {
                arr[e] = arr[e - 1];
                e--;
            }

            e = arr.size() - 1;
            arr[s] = temp;
        }
    }
    else if(c == 'b'){
        for(int i = 0 ; i< k; i++){
            int temp = arr[0];
            while(s<= e){
                arr[s]= arr[s+1];
                s++;
            }

            arr[e] = temp ;
            s = 0;
        }
    }
}

int main()
{

    vector<int> arr = {4 , 6 , 2};

    RotateForwardAndBackWard(arr, 'b', 5);

    for(int r:  arr){
        cout<< r<<" ";
    }
    
    return 0;
}

#include <iostream>
#include <vector>

using namespace std;

void RotateAtKIndex(vector<int> &arr, int n)
{
    int s = 0;
    int e = arr.size()-1;

    for (int i = 0; i < n; i++)
    {
        int temp = arr[e];
        cout<<"Temp Value "<<temp<<endl;
        while (s <= e)
        {
            arr[e] = arr[e - 1];
            e--;
        }

        e = arr.size()-1;
        arr[s] = temp;
    }
}

int main()
{

    vector<int> arr = {1, 2, 3, 4, 8, 9};

    RotateAtKIndex(arr, 2);

    for (int row : arr)
    {
        cout << row << " ";
    }
    cout << endl;
    cout << endl;
    cout << "Ache Se Work kr rha ha !!";

    return 0;
}
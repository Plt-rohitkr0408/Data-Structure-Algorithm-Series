#include <iostream>
using namespace std;

void arrayfun(int ary[], int size)
{
    for (int j = 0; j < size; j++)
    {
        ary[j] = 2 * ary[j];
    }
}

void print(int arr[], int s)
{
    for (int i = 0; i < s; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int linearSearch(int arr[], int s, int trg)
{

    for (int i = 0; i < s; i++)
    {
        if (arr[i] == trg)
        {

            return i;
        }
    }

    return -1;
}

void reverseArray(int arr[], int sz)
{   
    int strt = 0, end = sz -1 ;
    while (strt <= end)
    {
        swap(arr[strt], arr[end]);
    }
}

int main()
{

    int arr[] = {1, 5, 6, 8, 5, 41, 45};
    int size = sizeof(arr) / sizeof(arr[0]);

    // cout<<"Before array Updation" <<endl;
    // print(arr , size);
    // cout<<"after array Updation"<<endl;
    // arrayfun(arr , size);
    // print(arr , size) ;
    // Linear Seacher
    // int target = 18;
    // cout << "Index of target is ";
    // cout << linearSearch(arr, size, target) << " ";

    // REVERSE ARRAY
    cout << "Before array Reverse" << endl;
    print(arr, size);
    cout << "After Array Reverse" << endl;
    reverseArray(arr, size);
    print(arr, size);

    return 0;
}
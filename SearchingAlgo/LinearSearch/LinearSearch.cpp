#include <iostream>
using namespace std;

int LinearSearch(int *arr, int s, int key)
{
    for (int i = 0; i < s - 1; i++)
    {
        if (arr[i] == key)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {1, 2, 6, 4, 8, 3, 84, 10};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key = 4;
    int index = LinearSearch(arr, size, key);
    cout << "Index of Element " << key << " is " << index;
    return 0;
}

// Time complexity of Linear search is O(n) e4d
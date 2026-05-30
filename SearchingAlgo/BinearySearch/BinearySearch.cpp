#include <iostream>
#include <vector>
using namespace std;

int BinearySearch(vector<int> vec, int size, int key)
{
    int strt = 0;
    int end = size - 1;

    int mid = strt + (end - strt) / 2;

    while (strt <= end)
    {
        if (vec[mid] == key)
        {
            return mid;
        }
        else if (vec[mid] > key)
        {
            end = mid - 1;
            mid = strt + (end - strt) / 2;
        }
        else if (vec[mid] < key)
        {
            strt = mid + 1;
            mid = strt + (end - strt) / 2;
        }
    }

    return -1;
}

int main()
{

    vector<int> vec = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int size = vec.size();

    int key = 15;

    int index = BinearySearch(vec, size, key);

    cout << "Index of Element " << key << " is " << index;

    return 0;
}

// Notes :  TIme Complexity of BinearySearch is O(log n)
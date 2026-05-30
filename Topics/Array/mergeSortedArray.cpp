#include <iostream>
#include <vector>
using namespace std;

void mergeSortedArray(vector<int> &arr1, vector<int> &arr2, vector<int> &arr3, int n, int m)
{
    int i = 0;
    int j = 0;

    while (i < n && j < m)
    {

        if (arr1[i] <= arr2[j])
        {
            if (arr1[i] != 0)
            {
                arr3.push_back(arr1[i]);

                i++;
            }
        }
        else
        {
            if (arr2[j] != 0)
            {
                arr3.push_back(arr2[j]);
                j++;
            }
        }
    }

    while (i < n)
    {
        if (arr1[i] != 0)
        {
            arr3.push_back(arr1[i]);

            i++;
        }
    }

    while (j < m)
    {

        if (arr1[i] != 0)
        {
            arr3.push_back(arr2[j]);
            j++;
        }
    }
}

int main()
{

    vector<int> arr1 = {1, 2, 4, 6, 7, 5};
    vector<int> arr2 = {3, 4, 5, 1, 0, 2};

    vector<int> arr3;
    int n = arr1.size();
    int m = arr2.size();

    mergeSortedArray(arr1, arr2, arr3, n, m);

    for (int row : arr3)
    {
        cout << row << " ";
    }
    return 0;
}

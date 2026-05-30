
#include <iostream>
#include <vector>
using namespace std;

int SearchsortedRotatedArray(vector<int> &nums, int n, int key)
{
    int s = 0;
    int e = n - 1;
    int mid = s + (e - s) / 2;

    while (s <= e)
    {
        if (nums[mid] == key)
        {
            return mid;
        }
        else if (nums[mid] < key < nums[e])
        {
            s = mid + 1;

            cout << "\nstart is " << s << endl;
        }
        else
        {
            e = mid;
            cout << "\n end  is " << e << endl;
        }
        mid = s + (e - s) / 2;
    }

    return -1;
}

int main()
{

    vector<int> vec = {8, 9, 4, 5};

    int index = SearchsortedRotatedArray(vec, vec.size(), 3);

    cout << " Index is " << index;

    return 0;
}
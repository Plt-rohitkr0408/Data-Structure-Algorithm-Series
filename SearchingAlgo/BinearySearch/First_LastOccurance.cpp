#include <iostream>
#include <vector>
using namespace std;

int FirstOccurance(vector<int> vec, int s, int key)
{
    int strt = 0;
    int end = s - 1;
    int mid = strt + (end - strt) / 2;
    int ans = -1;
    while (strt <= end)
    {
        if (vec[mid] == key)
        {
            ans = mid;
            end = mid - 1;
        }
        else if (vec[mid] > key) 
        {
            end = mid - 1;
        }
        else if (vec[mid] < key)
        {
            strt = mid + 1;
        }
        mid = strt + (end - strt) / 2;
    }
    return ans;
}

int LastOccurance(vector<int> vec, int s, int key)
{
    int strt = 0;
    int end = s - 1;
    int ans = -1;

    int mid = strt + (end - strt) / 2;

    while (strt <= end)
    {
        if (vec[mid] == key)
        {
            ans = mid;
            strt = mid + 1;
        }
        else if (vec[mid] > key)
        {
            end = mid - 1;
        }
        else if (vec[mid] < key)
        {
            strt = mid + 1;
        }
        mid = strt + (end - strt) / 2;
    }
}

int main()
{

    vector<int> vec = {1, 2, 2, 4, 5, 5, 5, 5, 5, 7};

    int First = FirstOccurance(vec, vec.size(), 5);
    cout << "First occurance of 5 is " << First << endl;

    int last = LastOccurance(vec, vec.size(), 5);
    cout << "Last Occurance of 5 is " << last;

    return 0;
}
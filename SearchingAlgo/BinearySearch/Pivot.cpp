#include <iostream>
#include <vector>
#include <algorithm> 

using namespace std;
int findMinIndex(vector<int> &vec)
{
    
    if (vec.empty()) {
        return -1;
    }
    
    int s = 0;
    int e = vec.size() - 1;
    while (s < e)
    {
        int mid = s + (e - s) / 2;
        if (vec[mid] > vec[e])
        {
            s = mid + 1;
        }
    
        else
        {
            e = mid;
        }
    }
    return s;
}

int main()
{
    vector<int> vec = {7, 8, 9, 10, 1, 3};

    
    cout << "Pivot index is " << findMinIndex(vec);
    
    return 0;
}
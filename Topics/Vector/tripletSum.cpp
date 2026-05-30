#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

int main()
{

    vector<int> nums = {-1, 0, 1, 2, -1, 4};
    vector<vector<int>> res;

    for (int a = 0; a < nums.size() - 2; a++)
    {
        for (int b = a + 1; b < nums.size() - 1; b++)
        {
            for (int c = b + 1; c < nums.size(); c++)
            {
                if (nums[a] + nums[b] + nums[c] == 0)
                {
                    res.push_back({nums[a], nums[b], nums[c]});
                }
            }
        }
    }

    cout<<"Before apply operations "<<endl;
    for(auto &row: res){
        for(auto &x: row){
            cout<<x<<" ";
        }
        cout<<endl;
    }

    for (auto &row : res)
    {
        sort(res.begin(), res.end());
    }

    set<vector<int>> s(res.begin(), res.end());

    vector<vector<int>> uniqueRes(s.begin(), s.end());
    cout << "New sorted Element is : " << endl;
    for (auto &row : uniqueRes)
    {
        for (auto &x : row)
        {
            cout << x << " ";
        }
        cout << endl;
    }
    return 0;
}
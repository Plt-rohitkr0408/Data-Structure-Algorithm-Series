#include <iostream>
#include <vector>
using namespace std;

vector<int> zeroOneSort(vector<int> &nums)
{
    for (int i = 0; i < nums.size() - 2; i++)
    {
        for (int j = i + 1; j < nums.size(); j++)
        {
            if (nums[i] > nums[j])
            {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
                // swap(nums[i], nums[j]);
            }
        }
    }

    return nums;
}

void print(vector<int> &nums, int s)
{  
    for (auto row : nums)
    {
        cout << row << " ";
    }
}

int main()
{
    vector<int> vec = {0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0};

    print(vec, vec.size());
    zeroOneSort(vec);
    cout << endl;
    print(vec, vec.size());

    return 0;
}




// Hint /////////

// int s = 0;
// int e = size -1 ;
// while(s < e){
//     if(input[s] == 0){
//         s++;
//     }else if (input[e] == 1){
//             e-- ;
//     }
//     else if(input[s] == 1 && input[e] == 0){
//         swap(input[s] , input[e]) ;
//     }
// }

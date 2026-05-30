
#include <iostream>
#include <vector>
using namespace std;

int main()
{

    vector<int> vec = {1,2,3,4,5,6,7};
    int k = 3;

    cout << "Before Rotation" << endl;
    for (auto &row : vec)
    {
        cout << row << " ";
    }

    int last = vec.size() - 1;
    for (int a = 0; a < k; a++)
    {
        int elem = vec[last];
        for (int i = last; i >=0; i--)
        {
            vec[i] = vec[i - 1];
        }
        vec[0] = elem;
    }

    cout << endl;
    for (auto &row : vec)
    {
        cout << row << " ";
    }

    return 0;
}

// OutPut ----> {4 , 5 , 1 , 2 , 3}
#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int arr[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout<<endl;
    }

    for (int col = 0; col < 3; col++)
    {
        if (col & 1)
        {
            for (int row = 2; row >= 0; row--)
            {
                cout << arr[row][col] << " ";
            }
        }
        else
        {
            for (int row = 0; row < 3; row++)
            {
                cout << arr[row][col] << " ";
            }
        }
    }

    return 0;
}
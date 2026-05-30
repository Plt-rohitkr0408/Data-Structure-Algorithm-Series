
#include <iostream>
#include <vector>
using namespace std;

int main()
{

    vector<int> vec1 = {1, 2};
    vector<int> vec2 = {3, 4};
    double sum = 0;

    for (int i = 0; i < vec2.size(); i++)
    {
        vec1.push_back(vec2[i]);
    }
    cout << "Array Before Sorting" << endl;
    for (int i = 0; i < vec1.size(); i++)
    {
        cout << vec1[i] << " ";
    }

    cout << endl;

    // sorting

    for (int a = 0; a < vec1.size() - 1; a++)
    {
        for (int b = a + 1; b < vec1.size(); b++)
        {
            if (vec1[a] > vec1[b])
            {
                swap(vec1[a], vec1[b]);
            }
        }
    }
    cout << "Array After Sorting" << endl;
    for (int i = 0; i < vec1.size(); i++)
    {
        cout << vec1[i] << " ";
    }

    int size = vec1.size();
    cout << endl
         << "size is " << size << endl;
    int ind = size / 2;
    if (size % 2 == 1)
    {
        cout << "Median of Array " << vec1[ind] << endl;
    }
    else
    {
        cout << "Index is " << ind << endl;
        cout << vec1[ind - 1] << " " << vec1[ind] << endl;
        double res = vec1[ind] / 2;
        cout << "Res is " << res<<endl;
        double result = (vec1[ind - 1] + vec1[ind]) / 2.0;
        cout << "median of array " << result << endl;
    }
    return 0;
}
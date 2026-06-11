
package Array;

import java.util.*;

class SortZeroOneTwo {

    public static void sort(int arr[], int n, int res[]) {
    
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int index = 0;
        int num = 0;
        for (int m : map.values()) {
            int i = 0;
            while (i < m){
                res[index] = num;
                index += 1;
                i++;
            }
            
            num += 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 1, 2 };
        int n = arr.length;
        int res[] = new int[n];
    
        sort(arr, n, res);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
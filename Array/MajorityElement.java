package Array;

import java.util.*;

public class MajorityElement {

    public static int majority(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > n / 2) {
                return m.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 9, 1, 5, 2, 2 };
        int n = arr.length;
        int res = majority(arr, n);

       
        System.out.println("result is " + res);

    }
}

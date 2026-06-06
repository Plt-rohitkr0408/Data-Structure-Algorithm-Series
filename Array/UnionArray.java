package Array;

import java.util.*;

public class UnionArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 2, 3, 4, 5 };
        int arr1[] = { 1, 2, 6, 7 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (Integer i : set) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

    }
}

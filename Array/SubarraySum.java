package Array;

import java.lang.reflect.Array;
import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        // int sum = 3;
        // int count = 0;
        List<List<Integer>> subarray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int a = i; a < arr.length; a++) {
                int index = a - i + 1;
                int[] temp = new int[index];
                int first = 0;
                for (int j = i; j <= a; j++) {
                    temp[first] = arr[j];
                    first++;
                    System.out.print(arr[j] + " ");
                }
                List<Integer> once = new ArrayList<>();
                for (int b : temp) {
                    once.add(b);
                }

                subarray.add(once);
                System.out.println();
            }
        }

        System.out.println(subarray);
    }
}

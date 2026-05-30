package Recursion;

import java.util.*;

public class SubSequenceSum {

    public static void sum(int i, ArrayList<Integer> arrlist, int[] arr, int sum) {
        if (i >= arr.length) {
            int res = 0;
            for (Integer a : arrlist) {
                res += a;
            }
            if (res == sum) {
                for (Integer b : arrlist) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
            return;
        }

        arrlist.add(arr[i]);
        sum(i + 1, arrlist, arr, sum);
        arrlist.remove(arrlist.size() - 1);
        sum(i + 1, arrlist, arr, sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2,1 };
        int sum = 2;
        ArrayList<Integer> arrlist = new ArrayList<>();
        sum(0, arrlist, arr, sum);

    }
}

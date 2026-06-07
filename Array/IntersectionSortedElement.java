package Array;

import java.util.*;

public class IntersectionSortedElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 7 };
        int ar1[] = { 0, 1, 2, 3, 4, 6 };
        Set<Integer> set = new HashSet<>();
        int a = 0;
        int n = ar1.length;
        int m = arr.length;
        while (a < n) {
            for (int i = 0; i < m; i++) {
                if (ar1[a] == arr[i]) {
                    set.add(ar1[a]);
                }
            }
            a = a + 1;
        }
        int b = 0;
        while (b < m) {
            for (int i = 0; i < n; i++) {
                if (arr[b] == ar1[i]) {
                    set.add(arr[b]);
                }
            }
            b = b + 1;
        }

        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}

package TWOD_ARRAY;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumZero {
    public static void main(String arg[]) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        // for (int i = 0; i < n - 2; i++) {
        // List<Integer> temp = new ArrayList<>();
        // for (int j = i + 1; j < n - 1; j++) {
        // for (int k = j + 1; k < n; k++) {
        // if (arr[i] + arr[j] + arr[k] == 0) {
        // temp.add(arr[i]);
        // temp.add(arr[j]);
        // temp.add(arr[k]);
        // list.add(temp);
        // }

        // }
        // }
        // }

        for (int i = 0; i < n - 2; i++) {
            List<Integer> temp = new ArrayList<>();
            if (arr[i] + arr[i + 1] + arr[i + 2] == 0) {
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                temp.add(arr[i + 2]);
                list.add(temp);
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (List<Integer> l : list) {
            System.out.print(l + " ");
        }

    }
}

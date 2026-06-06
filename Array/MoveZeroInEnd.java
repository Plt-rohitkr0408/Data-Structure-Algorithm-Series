package Array;

import java.util.*;

public class MoveZeroInEnd {
    public static void main(String[] args) {
        int arr[] = { 1, 0,2,0,3,0,4,0,5};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(0);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LongestConsecutiveSquence {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 101, 2, 3, 105, 4 };

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 1;
        int max = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            int value = list.get(i);
            int next = value + 1;
            if (list.get(i + 1) == next) {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }

        }

        System.out.println("count is " + max);
    }
}
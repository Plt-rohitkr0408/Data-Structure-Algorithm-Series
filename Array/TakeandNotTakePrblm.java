package Array;

import java.util.*;

public class TakeandNotTakePrblm {
    public static void generate(int index, int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // taking case
        current.add(arr[index]);
        generate(index + 1, arr, current, result);

        // not taking case
        current.remove(current.size() - 1);
        generate(index + 1, arr, current, result);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        List<List<Integer>> result = new ArrayList<>();

        generate(0, arr, new ArrayList<>(), result);

        System.out.println(result);
    }
}

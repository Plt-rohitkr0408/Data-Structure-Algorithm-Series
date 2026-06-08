package Array;

import java.util.*;

public class MaximunConsecutiveNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1 };
        int n = arr.length;
        int count = 1;
        Set<Integer> list = new HashSet<>();

        for (int a = 1; a < n; a++) {
            if (arr[a - 1] == arr[a]) {
                count += 1;
            } else {
                list.add(count);
                count = 1;
            }
        }

        int max = Collections.max(list);
        System.out.println(max);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            System.out.println(i.getKey());
        }

    }
}

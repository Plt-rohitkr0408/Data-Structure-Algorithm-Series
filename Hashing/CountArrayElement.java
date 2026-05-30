package Hashing;

import java.util.*;

public class CountArrayElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 5, 2, 4, 3 };
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (index < arr.length ) {
            int number = arr[index];
            int count = 0;
            for (int i = index; i < arr.length; i++) {
                if (number == arr[i]) {
                    if (map.get(number) == null) {
                        count = count +1;
                        map.put(number, count);
                    } else {
                        count = map.get(number) + 1;
                        map.put(number, count);
                    }
                }
            }
            index = index + 1;
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}

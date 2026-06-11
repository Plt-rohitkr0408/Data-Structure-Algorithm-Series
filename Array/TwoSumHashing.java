package Array;

import java.util.HashMap;

public class TwoSumHashing {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 8, 9 };
        int sum = 14;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int result = sum - arr[i];
            if (hashMap.containsKey(result)) {
                System.out.println(hashMap.keySet() + "->" + hashMap.get(result) + " " + i + "->" + hashMap.get(i));
                return;
            }
            hashMap.put(arr[i], i);
        }

    }

}

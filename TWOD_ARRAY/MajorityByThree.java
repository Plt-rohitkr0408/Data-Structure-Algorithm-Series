package TWOD_ARRAY;

import java.util.*;

public class MajorityByThree {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 5, 3, 6, 4, 2, 1 };
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " ---> " + m.getValue());
            if (m.getValue() > n / 3) {
                list.add(m.getKey());
            }
        }

        System.out.print("List value is :");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

}

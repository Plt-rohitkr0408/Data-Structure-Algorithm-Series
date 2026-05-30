package DivisorProblem;

import java.util.ArrayList;

public class FunnyDivisor {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 6, 11 };
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                l.add(arr[i]);
            }
        }
        int sum = 0;
        for (Integer a : l) {
            System.out.println(a);
            sum += a;
        }

        System.out.println(sum);
    }
}

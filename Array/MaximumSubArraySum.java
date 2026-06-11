package Array;

import java.util.*;

public class MaximumSubArraySum {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        int size = arr.length;
        System.out.println("Enter k value ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < size - k + 1; i++) {
            List<Integer> temp = new ArrayList<>();
            int index = i;
            int sum = 0;
            for (int j = 0; j < k; j++) {
                temp.add(arr[index]);
                sum += arr[index++];
            }
            list.add(temp);
            System.out.println(sum);
        }

        for (List<Integer> a : list) {
            System.out.println(a);
        }

    }
}

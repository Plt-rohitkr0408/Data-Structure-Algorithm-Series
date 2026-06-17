
package Array;

import java.util.*;

public class SumofTwoArray {
    public static void main(String[] args) {
        int arr[] = { 9,9,9 };
        int arr1[] = { 1, 2, 3 };

        List<Integer> list = new ArrayList<>();
        int reminder = 0;
        int n1 = arr.length;
        int n2 = arr1.length;
        if (n1 > n2) {
            int index = 0;
            for (int i = 0; i < n2; i++) {
                int sum = arr[i] + arr1[i] + reminder;
                int div = sum % 10;
                reminder = sum / 10;
                list.add(div);
                index++;
            }
            for (int a = index + 1; a < n1; a++) {
                int sum = reminder + arr[a];
                reminder = sum / 10;
                int div = sum % 10;
                list.add(div);
            }
            if(reminder > 0){
                list.add(reminder);
            }
        } else {
            int index = 0;
            for (int i = 0; i < n1; i++) {
                int sum = arr[i] + arr1[i] + reminder;
                int div = sum % 10;
                reminder = sum / 10;
                list.add(div);
                index++;
            }
            for (int a = index + 1; a < n2; a++) {
                int sum = reminder + arr1[a];
                reminder = sum / 10;
                int div = sum % 10;
                list.add(div);
            }

            if(reminder > 0){
                list.add(reminder);
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : arr1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
           System.out.println(list);

    }
}
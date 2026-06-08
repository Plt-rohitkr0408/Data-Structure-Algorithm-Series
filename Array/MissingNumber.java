package Array;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6 };
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum - arr[i];
        }
        System.out.println("Missing number is " + sum);
    }
    
}

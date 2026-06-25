package TWOD_ARRAY;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1 };
        int n = arr.length;
        int k = 3;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    count += 1;
                }
            }
        }

        System.out.println("number of subarray with sum " + k + " is " + count);
    }
}

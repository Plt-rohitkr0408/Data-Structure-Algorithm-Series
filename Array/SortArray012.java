package Array;

public class SortArray012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 0, 1, 2, 0 };
        int n = arr.length;

        int mid = 0;
        int low = 0;
        int high = n - 1;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {

                mid++;
            } else if (arr[mid] == 2) {
                int temp1 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp1;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

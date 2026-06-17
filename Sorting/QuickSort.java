package Sorting;

public class QuickSort {

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i < j) {
                i++;
            }
            while (arr[j] > arr[pivot] && i < j) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, i-1, pivot);
        for(int k: arr){
            System.out.print(k+" ");
        }
        System.out.println();
        return i;
    }

    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 2, 5, 9, 7, 10, 6 };
        System.out.println("-----Quick sorting-----");
        int high = arr.length - 1;
        quick(arr, 0, high);


        System.out.println("Result of quick sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

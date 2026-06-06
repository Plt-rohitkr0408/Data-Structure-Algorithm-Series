package Array;


public class LargestElement {
    public static void insertionSort(int[] arr , int low ,int high) {
        for(int i = 1; i< high ; i++){
            int j =i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] =  arr[j-1];
                arr[j-1] =  temp;
                j--;
            }
        }
        
    }
    public static int partition(int arr[], int low,int high){
        int p = low;
        int i =  low;
        int j = high;
        while(i < j){
            while(arr[i] <= arr[p] &&  i < j){
                i++;
            }
            while(arr[j] > arr[p] &&  i < j){
                j--;
            }
            if(i< j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[p];
        arr[p] = temp;


        return i;
    }
    public static void quick(int [] arr,  int low, int high){
        if(low < high){
            int pivot = partition(arr, low ,high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1 , high);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4 ,2,3,5,1,6,9,7};
        insertionSort(arr, 0, arr.length);
        System.out.println("after Insertion sort");
        for(int i = 0; i< arr.length  ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("largest element ----- " + arr[arr.length -1]);
    }
}




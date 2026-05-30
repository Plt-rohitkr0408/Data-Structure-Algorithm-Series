package Sorting;

public class BubbleSort {

    public static void bubble(int arr[] , int n){
        for(int i=n-1; i >= 0 ;i--){
            for(int j =0 ; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }

        for( int  a =0; a < n ;a++){
            System.out.print(arr[a]+ " ");
        }
    }

    public static void selectionSort(int arr[], int n){
        for(int i = 0; i< n ; i++){
            int index =i;
            for(int j= i+1 ; j< n ; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("--- selection sort----");
         for( int  a =0; a < n ;a++){
            System.out.print(arr[a]+ " ");
        }
    }

    public static void insertionSort(int arr[] , int n){
        System.out.println("----- before sorting ------");
         for( int  a =0; a < n ;a++){
            System.out.print(arr[a]+ " ");
        }
        System.out.println();
        System.out.println("------ insertion sort -----");
        for(int i=1; i< n ;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] =  arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
         for( int  a =0; a < n ;a++){
            System.out.print(arr[a]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = { 4,6,1,54,2,4,3};
        int n= arr.length ;
        insertionSort(arr, n);
    }
    
}

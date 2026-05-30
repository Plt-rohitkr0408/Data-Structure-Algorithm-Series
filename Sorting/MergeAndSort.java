package Sorting;

public class MergeAndSort {
    public static void mergeSort(int arr[], int m , int arr1[], int n , int res[]){
        int index=0;
        int left =0;
        int right =0;
        while(left < m && right < n){
            if(arr[left] > arr1[right]){
                res[index] =  arr1[right];
                right =  right +1;
                index = index+1;
            }else{
                res[index] = arr[left];
                left =  left +1;
                index = index+1;
            }
        }
        while(left < m){
            res[index++] = arr[left++];
            // left =  left +1;
            // index = index+1;
        }
        while(right < n){
            res[index++] = arr1[right++];
            // right =  right +1;
            // index = index+1;
        }

        for(int i=0 ;i< m+n ; i++){
            System.out.print(res[i] + " ");
        }
        
    }
    public static void main(String arsg[]){
        int arr[] = { 1,2 , 3  , 0, 0 , 0};
        int m =3;
        int arr1[] = { 2 , 5,6};
        int n = 3;
        int res[] = new int[m+n];

        mergeSort(arr, m, arr1, n, res);

    }
}

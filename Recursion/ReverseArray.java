package Recursion;


public class ReverseArray {
    public static void print(int[] arr, int l ,  int r){
        int left = l;
        int right = r;

        if(left > right ){
            for(int i = 0 ; i< arr.length  ; i++){
                System.out.print(arr[i] + " ");
            }
            return ;
        }

        int temp = arr[left];
        arr[left++] =  arr[right];
        arr[right--] = temp;
        print(arr, left , right);
     
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4};
        print(arr , 0 , arr.length -1);
    }
}

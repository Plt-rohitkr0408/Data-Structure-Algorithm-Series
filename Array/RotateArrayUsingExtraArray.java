package Array;

import java.util.*;
public class RotateArrayUsingExtraArray {
    public static void main(String[] args) {
        int arr[]  ={1 ,2,3,4,5,6,7};
        int n = arr.length;
        System.out.print("Enter the index to rotate : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        // System.out.println();

        if(d >= n){
            d = d % n ;
        }

        List<Integer> list = new ArrayList<>();
        for(int i =  0 ; i< d; i++){
            list.add(arr[i]);
        }

        for(int i =  d ; i< n; i++){
            arr[i-d] =  arr[i];
        }
        int temp = n-d ;
        for(Integer i : list){
            arr[temp] =  i;
            temp++;
        }

        for(int i =0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }


    }
    
}

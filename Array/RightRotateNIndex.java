package Array;

import java.util.Scanner;

public class RightRotateNIndex {
    public static void main(String[] args) {
        int arr[]  ={1 ,2,3,4,5,6,7};
        int n = arr.length;
        System.out.print("Enter the index to rotate : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        if(d >= n){
            d = d % n;
        }

        for(int i= 0; i< d ; i++){
            int temp = arr[n-1];
            for(int a = n-1 ; a >0 ;a--){
                arr[a] = arr[a-1];
            }
            arr[0] =  temp;
        }
        
        for(int i = 0; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

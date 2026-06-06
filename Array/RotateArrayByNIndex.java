package Array;

import java.util.Scanner;

public class RotateArrayByNIndex {
    public static void main(String[] args){
        int arr[]  ={1 ,2,3,4,5,6,7};
        int n =  arr.length;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the k value :");
        int k = sc.nextInt();
        System.out.println("-----------");
        for( int i = 0 ; i< k ; i++){
            int temp = arr[0];
            for(int j = 1 ; j< n; j++){
                arr[j-1] =  arr[j];
            }
            arr[n-1] = temp ;
        }

        for(int a = 0 ; a< n ; a++){
            System.out.print(arr[a]+ " ");
        }
    }
}

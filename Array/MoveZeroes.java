package Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0 , 1 , 0 , 2 , 0 , 3 , 4 , 0 , 0 ,0 };
        int n =  arr.length ;
        int a =0;
        for(int i =0 ; i< n ;i++){
            if(arr[i] != 0) arr[a++] = arr[i] ;
        }

        while(a  != n){
            arr[a] = 0;
            a++;
        }

        for(int i =0; i< n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        //   int arr[] = { 4 ,2,3,5,1,6,9,9,7,8,7};
          int arr[] = { 1,7,7,7,7,7,7};
          int largest = arr[0];
          int second = -1;
          for(int i = 1 ; i< arr.length ;i++){
            if(arr[i] > largest){
                largest =  arr[i];
            }
          }
          for( int i =0 ;i< arr.length ;i++){
            if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
          }
          System.out.println("-- Largest Element------");
          System.out.println(largest);

          System.out.println("---second largest element---");
          System.out.println(second);

    }
    
}

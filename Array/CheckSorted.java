package Array;

public class CheckSorted {
    public static boolean checkSorted(int arr[],  int n){
        if( n == 1){
            return true;
        }
        if(arr[0] < arr[1]){
            for(int i = 0 ; i< n-1 ;i++){
                if(arr[i] > arr[i+1]){
                    return false;
                }
            }
        }else{
            for(int i = 0 ; i< n-1 ;i++){
                if(arr[i] < arr[i+1]){
                    return false;
                }
            }
        }
        return true;
        

    }
    public static void main(String[] args) {
        int arr[] ={3 , 4 ,1 , 5 , 6};
        System.out.println("Given array is sorted/no sorted " + checkSorted(arr, arr.length));
    }
    
}

public class SmallestDivisorNumber {
    public static void main(String[] args) {
        int[] arr = { 2 ,3,5,7,11};
        int size = arr.length;
        int sum =0;
        for(int i =0; i < size ;i++){
            sum += arr[i];
        }

        System.out.println("sum is " + sum);
        for(int i =2; i <=size ;i++){
            if(sum % i == 0){
                System.out.println( i);
                return ;
            }
        }
    
    }
    
}

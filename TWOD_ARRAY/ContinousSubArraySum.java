package TWOD_ARRAY;

public class ContinousSubArraySum {
    public static void main(String[] args) {
        int[] nums ={23,2,6,4,7};

        int n = nums.length;
        int k =6;
        int maxSum =0;
        int count=0;
         for(int i=0; i<n-1 ; i++){
            maxSum += nums[i];
            int sum =nums[i];
            for(int j=i+1; j< n; j++){
                sum += nums[j];
                if(sum == k){
                    count += 1;
                }
            }
        }

         maxSum += nums[n-1];
         System.out.println("Sum is "+ maxSum);
        int rem = maxSum % k;

        System.out.println("Counter is "+count);
        System.out.println("Remender is "+ rem);
        if( rem == 0 && count >= 1){
           System.out.println("True");
        }
        else{
            System.out.println("False");
        }
       

    }
    
}

package Array;

import java.util.*;
    
public class XORofTwiceNumber {

    public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //  for(int i =0 ; i< nums.length ; i++){
        //     map.put(nums[i] , 0);
        // }
        for(int i =0 ; i< nums.length ; i++){
            map.put(nums[i] , (map.get(nums[i]) == null) ? 1 : map.get(nums[i]) +1 );
        }

        int max = 0;
        int maxValue =0;
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
           if(i.getValue() > 1){
             if(maxValue <= i.getValue()){
                maxValue = i.getValue() ;
                max  = max ^ i.getKey();
            }
           }
        }
    return max;
    }
    public static void main(String[] args){
        int arr[] = {10,18,7,10,18};

        System.out.println(0 ^ 10);

        int num = duplicateNumbersXOR(arr);

        System.out.println(num);
    }
}

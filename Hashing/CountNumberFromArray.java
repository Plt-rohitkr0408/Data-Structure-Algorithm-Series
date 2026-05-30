package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNumberFromArray {
    public static void count(int index ,int arr[] , int n, HashMap<Integer, Integer> m){
        if(index == n){
            for(Map.Entry<Integer, Integer> map : m.entrySet()){
                System.out.println(map.getKey() + " "+ map.getValue() + " ");
            }
            return;
        }
        int count;
        if( m.get(arr[index]) ==  null){
            count = 0 ;
        }else{
           count = m.get(arr[index]);
        }
        m.put(arr[index] ,count +1);
        count(index +1 , arr, n, m);
    
    }
    public static void main(String arg[]){
        int[] arr = { 1,2,3,4,1,2,5,2,4,3};
        HashMap<Integer, Integer> hashmap = new HashMap<>(5);
        // for(Map.Entry<Integer, Integer> m : hashmap.entrySet()){
        //     System.out.println(m.getKey() + " " +m.getValue());
        // }
        // System.out.println(hashmap.get(2));
        count(0,arr, arr.length , hashmap);
    }
}

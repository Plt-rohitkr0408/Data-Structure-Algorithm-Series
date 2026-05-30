package Recursion;

import java.util.ArrayList;

public class CountSubSequence {

    public static int countSequence(int index , ArrayList<Integer> arrlist ,int s, int[] arr , int sum , int n){
        if(index == n){
            if(s == sum){
                return 1;
            }
            return 0;
        }

        arrlist.add(arr[index]);
        s =  s + arr[index] ;
        int l = countSequence(index + 1, arrlist, s, arr, sum, n)  ;
        int value =arrlist.remove(arrlist.size() -1);
        s = s - value ;
        int r = countSequence(index + 1, arrlist, s, arr, sum, n);
        return l + r;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3, 5,1};
        int sum = 5;
        int n = arr.length ;
        // System.out.println(n);
        ArrayList<Integer> arrlist = new ArrayList<>();

        int count = countSequence(0, arrlist,0, arr, sum , n);
        System.out.println(count);
    }
}

package Recursion;
import java.util.*;
class SubSequence{
    public static void subseq(int i , ArrayList<Integer> arrlist, int arr[]){
        if(i >= arr.length){
            for(Integer a :  arrlist){
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        arrlist.add(arr[i]);
        subseq(i+1 ,arrlist ,arr);
        arrlist.remove(arrlist.size() -1);
        subseq(i+1, arrlist, arr);

    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> al = new ArrayList<>();
        subseq(0, al, arr);
    }
}
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceElementWithGreatestElemet {
    public static void main(String[] args) {
        int[] arr ={ 17,18,5,4,6,1};
        int n = arr.length -1 ;
        int leader =-1;
        List<Integer> list = new ArrayList<>();
        for(int i=n ; i>=0 ;i--){
            if(i == (n-1)){
                list.add(leader);
                if(arr[i] > leader){
                    leader = arr[i];
                }
            }else{
                list.add(leader);
                if(arr[i] > leader) leader = arr[i];
            }
        }
        Collections.reverse(list);
        for(int i: list){
            System.out.print(i +" ");
        }

        
    }
}

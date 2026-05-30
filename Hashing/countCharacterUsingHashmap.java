package Hashing;
import java.util.*;

public class countCharacterUsingHashmap {
    public static void main(String args[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        String s = "abchshvcdacvs";
        
        for(int i =0 ; i< s.length() ; i++){
            if(map.get(s.charAt(i)-'a') == null){
                map.put(s.charAt(i) -'a',1 );
            }else{
             map.put(s.charAt(i) - 'a',map.get(s.charAt(i)-'a') +1 );
            }
        }

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            Integer n = m.getKey();
            String str =  Integer.toString(n);
            System.out.println(str+ " " + m.getValue());
        }
    }
}

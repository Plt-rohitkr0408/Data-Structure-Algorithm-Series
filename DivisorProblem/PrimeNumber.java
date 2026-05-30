package DivisorProblem;

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =2 ; i< n ;i++){
            int count=0;
            for(int a = 2; a<= i;a++){
                if(i % a == 0){
                    count++;
                }
            }
            if(count == 1){
                arr.add(i);
            }
        }

        for(Integer a : arr){
            System.out.println(a);
        }
    }
    
}

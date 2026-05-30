package Basic_Math;

import java.util.*;

public class PrintAllDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        /*
         * for(int i = 1; i<= number ; i++){
         * if(number %i == 0){
         * list.add(i);
         * }
         * }
         */

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
                if ((number / i) != i) {
                    list.add(number / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println("All divisor of " + number + " is");
        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }
}
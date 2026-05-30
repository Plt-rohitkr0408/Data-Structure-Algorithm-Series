package Basic_Math;

import java.util.*;

public class CountDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int dig =  (int) Math.log10(n) + 1;

        System.out.println(dig);
    }
    
}

package Recursion;

public class FactorialNNumber {

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        // int fact = 1;
        // for(int i = 1 ; i<6 ;i++){
        //     fact = fact * i;
        // }

        // System.out.println(fact);

        System.out.println(factorial(6));
    }
}

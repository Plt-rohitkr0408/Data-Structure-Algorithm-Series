package Basic_Math;

public class Palindrome {
    public static void main(String[] args){
        int n = 1212;

        System.out.println(result(n));

    }

    public static boolean result(int a){
        int reverse =  0;
        int n  =  a ;
        while(n>0){
            int dig =  n%10;
            reverse =  reverse *10 + dig;
            n = n/10;
        }

        if(a ==  reverse){
            return true;
        }

        return false;
    }
    
}

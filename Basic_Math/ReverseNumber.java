package Basic_Math;

public class ReverseNumber {
    public static void main(String[] args){
        int n = 7789;
        int reverseNumber =  0;
        while(n>0){
            int dig =  n % 10;
            reverseNumber =  reverseNumber * 10 + dig;
            n /= 10;
        }

        System.out.println(reverseNumber);
    }
}

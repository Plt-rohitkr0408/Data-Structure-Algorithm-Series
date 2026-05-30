package Array;

public class reverseNumber {

    public static int reverseNo(int num) {
        int reverse = 0;
        while(num !=0){
            int mod = num % 10;
            reverse =  reverse *10 + mod;
            num =  num /10;
        }

        return reverse;
    }
        

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseNo(num);
        System.out.println("Reversed Number: " + reversedNum);
    }
    
}

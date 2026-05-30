package Recursion;

public class SumNNumber {

    public static int sumNNumber(int n ,  int sum){
        if(n ==  0){
            return 0;
        }
        sum =  n + sumNNumber(n-1, sum);
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumNNumber(3, 0));
    }
    
}

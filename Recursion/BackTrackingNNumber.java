package Recursion;

public class BackTrackingNNumber {

    public static void forwardPrint(int n){
        if(n< 0){
            return ;
        } 
    
       forwardPrint(n -1) ;
       System.out.print(n + " ");
    }

    public static void backWardPrint(int n){
        if( n < 0){
            return;
        }

        System.out.print(n-- + " ");
        backWardPrint(n);
    }
    public static void main(String[] args) {
        forwardPrint(10);
        System.out.println();
        System.out.println("----------------------");
        backWardPrint(10);
    }
}

package Basic_Math;

public class CountOneDigit {
    public static void main(String[] args){
        int n = 13;
        // int count= 0;
        // int result = countDigit(n , 0);
        int resut = result(n, 0);
        System.out.println("total count of 1 in " + n + " is : " + resut);

    }

    public static int result(int n , int count){
        int plus = count;
        if(n==0){
            return plus;
        }
        int value = n;
        while(value>0){
            int dig =  value % 10;
            if(dig == 1){
                plus++;
            }  
            value = value/ 10;          
        }
        return result(n-1, plus);
    }

    // public static int countDigit(int n, int count){
    //     int digit = count;
    //    if(n == 0){
    //     return digit;
    //    }
    //     int value = n;
       
    //    while( value > 0){
    //     int dig =  value % 10;
    //     if(dig == 1){
    //         digit++;
    //     }
    //     value = value / 10;
    //    }
    //     // System.out.println("Enter the recursion  value "  + value + " and count " + digit);
    //   return countDigit(n-1,  digit);
    // }
    
}

package Basic_Match;
import java.util.*;

public class ExtractDigit {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the  number :");
        int n =  sc.nextInt();
        ArrayList<Integer> digit =  new ArrayList<>();
        int count= 0;
        while(n > 0){
            count++;
            int dig=  n%10;
            digit.add(dig);

            n /= 10;
        }
    
        // for(Integer a : digit){
        //     System.out.print(a + " ");
        // }
        System.out.println("total digit : " + count);
        for(int i = digit.size() - 1; i >= 0; i--){
            System.out.print(digit.get(i) + " ");
        }
    }
}

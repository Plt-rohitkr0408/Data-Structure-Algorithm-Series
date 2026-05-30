

package Basic_Math;
import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =  sc.nextInt();

        check(n);

    }

    public static void check(int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int count= 0;
        while(n>0){
            int dig =  n%10;
            count++;
            arr.add(dig);
            n =  n/10;
        }
        int sum =0;
        for(int i = 0 ; i< count; i++){
            int value = 1;
            for(int j =0 ; j< count; j++){
                value  *= arr.get(i);
            }

            sum += value;
        }

        System.out.println(sum);

        System.out.println(count);
        
    }
}
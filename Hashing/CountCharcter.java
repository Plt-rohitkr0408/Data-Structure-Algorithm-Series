
package Hashing;

import java.util.*;

class CountCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aAbAbBcsdsksCSDSADV";
        int size = s.length();
        String convert = s.toLowerCase();
        System.out.println(convert);
        int hash[] = new int[26];
        for(int i=0; i<size ; i++){
            hash[s.charAt(i)]++;
        }

        System.out.println("check character how many time appear");
    char ch = sc.next().charAt(0);
        System.out.println(hash[Character.toLowerCase(ch)]);

    }
}
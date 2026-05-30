package String;

public class Palindrome {
    public static void main(String[] args) {
        String a = "abdba";
        System.out.println(CheckPalindrome(a));
    }

    public static boolean CheckPalindrome(String a){
        int size =  a.length();
       int left= 0;
       int right =  size -1;
       while(left < right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
       }
       return true;
    }
}

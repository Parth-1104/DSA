import java.util.Scanner;

public class recPalindrome {
    static Boolean palindrome(String str) {
        if (str.length() <=1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return palindrome(str.substring(1, str.length() - 1));

        } else {
            return false;
        }
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            System.out.println(palindrome(name));

    }
}

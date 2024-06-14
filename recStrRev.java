import java.util.Scanner;

public class recStrRev {
    static String reverse(String str,int idx){
        if(idx==str.length()) return "";
        String Str=reverse(str,idx+1);
        return Str+str.charAt(idx);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(reverse(name,0));
    }
}

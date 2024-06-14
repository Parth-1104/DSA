import java.util.Scanner;

public class recrevStr
{
    static String reverse(String str){
        if(str.length()==0) return "";
        String Str=reverse(str.substring(1));
        return Str+str.charAt(0);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(reverse(name));
    }
}

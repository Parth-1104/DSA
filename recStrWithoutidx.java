public class recStrWithoutidx {
    static String remove(String s){
        String ans="",smallans="",str="";
        if(s.length()== 0) return "" ;
        if(s.charAt(0)!='a')
            ans=ans+s.charAt(0);
        str=s.substring(1);

        smallans=remove(str);

        return ans+smallans;
    }
    public static void main(String[]args){
        String a="aaapaaarthaaa";
        System.out.print(remove(a));
    }

}


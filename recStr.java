public class recStr {
    static String occr(String s,int idx){
        String ans="",smallans="";
        if(idx==s.length()) return "" ;
        if(s.charAt(idx)!='a')
            ans=ans+s.charAt(idx);
        smallans=occr(s,idx+1);

      return ans+smallans;
    }
    public static void main(String[]args){
        String a="aaapaaarthaaa";
        System.out.print(occr(a,0));
    }

}


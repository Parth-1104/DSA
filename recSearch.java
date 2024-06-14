public class recSearch {
    static boolean check(int[]arr,int target,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return  true;
        return check(arr,target,idx+1);
    }
    public static void main(String[]args){
        int[]num={11,12,14,15,1,66,13,3};
        System.out.println((check(num,4,0)) );

    }
}

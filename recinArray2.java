public class recinArray2 {
    static boolean exist(int[]arr,int target,int idx){
        if(idx==arr.length){
           return false;
        }
        if(arr[idx]==target) return true;


        if(exist(arr,target,idx+1)){
            return true;
        }
        else return false;

    }
    public static void main(String[]args){
        int[]num={12,45,67,89,34,32,6};
        if(exist(num,2,0)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}

public class recinArray {
    static int SumofArr(int[]arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int small = SumofArr(arr, idx+1);
        return arr[idx]+small;
    }
    public static void main(String[]args){
        int[]num={2,3,4,5};
        System.out.println(SumofArr(num,0));
    }
}

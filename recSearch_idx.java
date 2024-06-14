public class recSearch_idx {
        static int check(int[]arr,int target,int idx){
            if(idx==arr.length) return -1;
            if(arr[idx]==target) return  idx;
            return check(arr,target,idx+1);
        }

        static  void allIdx(int[]arr2,int target2,int idx2){
            if(idx2== arr2.length) return;
            if(arr2[idx2]==target2){

                System.out.print(idx2+" ");
            }
            allIdx(arr2, target2, idx2+1);

        }
        public static void main(String[]args){
            int[]num={11,12,14,15,1,66,13,3};
            int[]num2={1,2,1,3,4,2,1,3};
            System.out.println(check(num,4,0));
            allIdx(num2,2,0);


        }
    }



public class bubbleSort {

    static void Bubble(int[]arr)
    {
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }

            }
            if(!flag){
                return;
            }
        }

    }
    public static void main(String[]args){
        int []num={11,12,13,14,15};
        Bubble(num);
        for(int i:num){
            System.out.print(i+" ");
        }
    }
}

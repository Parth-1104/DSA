public class InsertSort {
    //take one element from unsorted part and find the best position in the sorted part
    static void insert(int[]arr)
    {
        int n=arr.length;
        for(int i=1;i<n-1;i++)
        {
            int j=i;//the unsorted array start from index 1 in beginning and increase by 1 each time
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
    }
    public static void main(String[]args){
        int []num={101,12,89,194,915};
        insert(num);
        for(int i:num){
            System.out.print(i+" ");
        }
    }
}

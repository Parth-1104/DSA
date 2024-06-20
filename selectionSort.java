public class selectionSort
{
    static void select(int[]arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {//searches the value for 0 in the array through j loop and interchange the value with 0;then continues for 1,2,...
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
                if (minIdx != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIdx];
                    arr[minIdx] = temp;


            }
        }
    }


        public static void main(String[]args) {
            int[] num = {54, 23, 101, 34, 11};
            select(num);
            for (int i : num) {
                System.out.print(i + " ");
            }
        }
}

package Arrays;

public class ThreeWayPartitioningOfArrayAroundaGivenRange
{
    public  static void threeWayPartition(int arr[], int a, int b) {
        int i = 0, start = 0, end = arr.length - 1;
        while (i <= end)
        {
            if (arr[i] < a)
            {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                i++;
                start++;
            }
            else if (arr[i] > b)
            {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
            else
            {
                i++;
            }
        }
    }
        public static void main(String[] args)
        {
            int[] arr={1,14,5,20,4,2,54,20,87,98,3,1,32};
            int lowVal=10,highVal=20;
            threeWayPartition(arr,lowVal,highVal);
            for(int x:arr)
            {
                System.out.print(x+" ");
            }
        }
}

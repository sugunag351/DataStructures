package Arrays;

public class FindingMinimumElementInARotatedSortedArrayUsingLinearSearch
{
    public static int findMin(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args)
    {
        int arr[]={5,6,1,2,3};
        System.out.println(findMin(arr));
    }
}

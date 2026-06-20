package Arrays;

public class PairSumInRotatedSortedArray
{
    static boolean pairInSortedRotated(int arr[], int target) {
        int n=arr.length;
        int i;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }
        int left=(i+1)%n;
        int right=i;
        while(left!=right)
        {
            if(arr[left]+arr[right]==target)
            {
                return true;
            }
            else if(arr[left]+arr[right]<target)
            {
                left=(left+1)%n;
            }
            else if(arr[left]+arr[right]>target)
            {
                right=(right-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={11,15,6,8,9,10};
        int target=16;
        System.out.println(pairInSortedRotated(arr,target));
    }
}

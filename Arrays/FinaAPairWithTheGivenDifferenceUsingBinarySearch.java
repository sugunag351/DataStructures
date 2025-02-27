package Arrays;
import java.util.Arrays;

public class FinaAPairWithTheGivenDifferenceUsingBinarySearch
{
    /* time complexity O(n*logn) */
    public static void main(String[] args)
    {
        int arr[]={5,20,3,2,5,80};
        int x=78;
        findPair(arr,x);
    }
    public static boolean binarySearch(int[] arr,int s,int e,int target)
    {
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]<target)
            {
                s=mid+1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else if(arr[mid]==target)
            {
                return true;
            }
        }
        return false;
    }

    public static void  findPair(int[] arr, int x)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            int target=arr[i]+x;
            if(binarySearch(arr,i+1,arr.length-1,target))
            {
                System.out.println("("+target+","+arr[i]+")");
            }

        }
    }
}

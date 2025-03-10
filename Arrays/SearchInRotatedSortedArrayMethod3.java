package Arrays;

public class SearchInRotatedSortedArrayMethod3
{
    // time complexity O(logn) using single binary search
    static int search(int[] arr, int key)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>=arr[high])// arr[low] to arr[mid] is soretd
            {
                if(key>=arr[low] && key<arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else if(arr[mid]<arr[high]) // arr[mid] to arr[high] is sorted
            {
                if(key>arr[mid] && key<=arr[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={5,6,7,8,9,10,1,2,3};
        int key=3;
        System.out.println(search(arr,key));
    }
}

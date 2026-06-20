package Arrays;

public class SearchInRotatedSortedArrayMethod2
{
    static int binarySearch(int[] arr,int low,int high,int x)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr,int low,int high)
    {
        while(low<high)
        {
            if(arr[low]<arr[high])
            {
                return low;
            }
            int mid=(low+high)/2;
            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else if(arr[mid]<=arr[high])
            {
                high=mid;
            }
        }
        return low;
    }

    static int search(int[] arr, int key)
    {
        int n=arr.length;
        int pivot=findPivot(arr,0,n-1);
        if(arr[pivot]==key)
        {
            return pivot;
        }
        if(pivot==0)
        {
            return binarySearch(arr,0,n-1,key);
        }
        if(arr[0]<=key)
        {
            return binarySearch(arr,0,pivot-1,key);
        }
        else if(arr[0]>key)
        {
            return binarySearch(arr,pivot+1,n-1,key);
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

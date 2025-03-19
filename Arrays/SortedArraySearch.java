package Arrays;

public class SortedArraySearch
{
    static boolean searchInSorted(int arr[], int k) {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]<k)
            {
                left=mid+1;
            }
            else if(arr[mid]>k)
            {
                right=mid-1;
            }
            else if(arr[mid]==k)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,6};
        int k=6;
        System.out.println(searchInSorted(arr,k));
    }
}

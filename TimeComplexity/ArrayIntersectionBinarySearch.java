package TimeComplexity;

public class ArrayIntersectionBinarySearch
{
    //this approach is better when the array does not contain duplicates
    // and when one array is too much smaller than the other array
    // time complexity for sorting smaller array O(n logn)
    // for each element in ar1,performing binary search in ar2 O(m logn)
    public  static boolean binarysearch(int ar2[],int key)
    {
        int i=0,j=ar2.length-1,mid;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(ar2[mid]<key)
            {
                i=mid+1;
            }
            else if(ar2[mid]>key)
            {
                j=mid-1;
            }
            else if(ar2[mid]==key)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int ar1[]={1,2,3,4,5};
        int ar2[]={2,3,5};
        for(int i=0;i<ar1.length;i++)
        {
            if(binarysearch(ar2,ar1[i]))
            {
                System.out.print(ar1[i]+" ");
            }
        }
    }
}

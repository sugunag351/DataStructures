package Arrays;

public class FindApairWithTheGivenDifferenceUsingTwopointApproach
{
    //This approach is efficient only if the array is already sorted
    public static void findPair(int[] arr, int x)
    {
        int i=0,j=1;
        int n=arr.length;
        while(i<n && j<n)
        {
            if(i!=j && (arr[j]-arr[i]==x || arr[i]-arr[j]==x))
            {
               System.out.println("("+arr[j]+","+arr[i]+")");
               i++;
               j++;
            }
            else if(arr[j]-arr[i]<x)
            {
                j++;
            }
            else if(arr[j]-arr[i]>x)
            {
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={3,6,9,12,15,25,30};
        int x=9;
        findPair(arr,x);

    }
}

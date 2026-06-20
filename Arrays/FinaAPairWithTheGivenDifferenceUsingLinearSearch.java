package Arrays;

public class FinaAPairWithTheGivenDifferenceUsingLinearSearch
{
    /* time complexity O(n*n) */
    public static void main(String[] args)
    {
        int arr[]={5,20,3,2,5,80};
        int x=78;
        findPair(arr,x);
    }
    public static  void findPair(int[] arr,int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if (i == j)
                {
                    continue;
                }
                if (arr[i] - arr[j] == x)
                {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}

package TimeComplexity;

public class FindLeadersInArray
{
    public static void main(String[] args)
    {
        int ar[]={16,17,4,3,5,2};
        int n=ar.length;
        System.out.print(ar[n-1]+" ");
        int max=ar[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(ar[i]>max)
            {
                max=ar[i];
                System.out.print(ar[i]+" ");
            }
        }
    }
}

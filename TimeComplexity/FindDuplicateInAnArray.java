package TimeComplexity;

public class FindDuplicateInAnArray
{
    public static int meth(int[] ar)
    {
        int sum1=0,n=ar.length;
        for(int i=1;i<=n-2;i++)
        {
            sum1+=i;
        }
        int sum2=0;
        for(int i=0;i<ar.length;i++)
        {
            sum2+=ar[i];
        }
        return (sum2-sum1);
    }
    public static void main(String[] args)
    {
        int ar[]={0,3,1,5,4,3,2};
        System.out.println(meth(ar));
    }
}

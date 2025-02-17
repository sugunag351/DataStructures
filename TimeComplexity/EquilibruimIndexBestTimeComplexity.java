package TimeComplexity;

public class EquilibruimIndexBestTimeComplexity
{
    static int index(int ar[])
    {
        int rightSum=0,n=ar.length;
        for(int i=0;i<n;i++)
        {
            rightSum+=ar[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            rightSum-=ar[i];
            if(leftSum==rightSum)
            {
                return i;
            }
            leftSum+=ar[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int ar[]={1,4,9,-16,2,-10};
        System.out.println(index(ar));

    }
}

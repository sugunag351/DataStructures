package TimeComplexity;

public class EquilibruimIndexWorstTimeComplexity
{
    static int index(int ar[])
    {
        int leftSum=0,rightSum;
        int n=ar.length,i;
        for(i=0;i<n-1;i++)
        {
            leftSum=(i==0)?0:leftSum+ar[i-1];
            rightSum=0;
            for(int j=i+1;j<n;j++)
            {
                rightSum+=ar[j];
            }
            if(leftSum==rightSum) {
                return i;
            }
        }
        if(leftSum+ar[i-1]==0)
        {
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int ar[]={1,-1,4};
        System.out.println(index(ar));

    }
}

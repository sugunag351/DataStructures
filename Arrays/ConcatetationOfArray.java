package Arrays;

public class ConcatetationOfArray
{
    public static int[] getConcatenation(int[] nums)
    {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            if(i<n)
            {
                ans[i]=nums[i];
            }
            else
            {
                ans[i]=nums[i-n];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5};
        int result[]=getConcatenation(nums);
        for(int x:result)
        {
            System.out.print(x+" ");
        }

    }
}

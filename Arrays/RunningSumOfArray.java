package Arrays;

public class RunningSumOfArray
{
    public  static int[] runningSum(int[] nums) {
        int ans[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=sum+nums[i];
            sum=sum+nums[i];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[]={3,1,2,10,1};
        int result[]=runningSum(nums);
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}

package Arrays;

public class BuildArrayFromPermutation
{
    public static void buildArray(int[] nums,int[] ans) {
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }

    }
    public static void main(String[] args)
    {
        int nums[]={5,0,1,2,3,4};
        int ans[]=new int[nums.length];
        buildArray(nums,ans);
        for(int x:ans)
        {
            System.out.print(x+" ");
        }

    }
}

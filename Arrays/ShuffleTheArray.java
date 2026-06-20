package Arrays;

public class ShuffleTheArray
{
    static public int[] shuffle(int[] nums, int n)
    {
        int ans[]=new int[nums.length];
        int count1=n;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
            {
                ans[i]=nums[count1++];
            }
            else
            {
                ans[i]=nums[count2++];
            }
        }
        return ans;

    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,4,3,2,1};
        int n=4;
        int[] result=shuffle(nums,n);
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}

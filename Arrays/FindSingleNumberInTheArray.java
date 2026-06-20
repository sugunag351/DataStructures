package Arrays;

public class FindSingleNumberInTheArray
{
    public static int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum^nums[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int nums[]={2,2,1};
        System.out.println(singleNumber(nums));
    }
}

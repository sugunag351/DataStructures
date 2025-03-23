package Arrays;

public class FindMissingNumberInArrayMethod2
{
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum2+=nums[i];
        }
        int missingNum=sum1-sum2;
        return missingNum;
    }
    public static void main(String[] args)
    {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}

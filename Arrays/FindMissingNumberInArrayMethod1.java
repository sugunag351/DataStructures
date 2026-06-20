package Arrays;

public class FindMissingNumberInArrayMethod1
{
    public static int missingNumber(int[] nums) {
        int flag,i;
        int n=nums.length;
        for(i=0;i<=n;i++)
        {
            flag=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}

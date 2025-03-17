package Arrays;

public class MoveZeroesToEndOfTheArray
{
    public static void moveZeroes(int[] nums)
    {
        int k=0,i=0;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
                k++;
            }
            else if(nums[i]==0)
            {
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] nums={0,1,0,2,13};
        moveZeroes(nums);
        for(int x:nums)
        {
            System.out.print(x+" ");
        }
    }
}

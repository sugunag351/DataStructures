package Arrays;

public class RotateArrayToRightByK_steps
{
    public static void reverse(int[] nums,int i,int j)
    {
        int temp;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for(int x:nums)
        {
            System.out.print(x+" ");
        }


    }
}

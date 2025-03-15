package Arrays;

public class RemoveDuplicates
{
    public static int removeDuplicates(int[] nums) {
        int n = nums.length, k = 0, i;
        for (i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[i];
        k++;
        return k;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,2};
        int k=removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
}

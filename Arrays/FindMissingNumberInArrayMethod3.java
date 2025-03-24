package Arrays;

public class FindMissingNumberInArrayMethod3
{
    public static int missingNumber(int arr[],int n)
    {
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++)
        {
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args)
    {
        int n=5;
        int nums[]={1,2,4,5};
        System.out.println(missingNumber(nums,n));

    }
}

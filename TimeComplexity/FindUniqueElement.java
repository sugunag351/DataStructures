package TimeComplexity;

public class FindUniqueElement
{
    // this method works only if the array contains exactly twice repeated numbers and only one unique element
    public static int Unique(int[] ar)
    {
        int res=0;
        for(int i=0;i<ar.length;i++)
        {
            res=res^ar[i];
        }
        return res;
    }
    public static void main(String[] args)
    {
        int ar[]={1,3,1,3,6,6,7,10,7};
       System.out.println(Unique(ar));
    }
}

package TimeComplexity;

public class MaximizeTheSum
{
    public static void main(String[] args)
    {
        int ar1[]={1,5,10,15,20,25};
        int ar2[]={2,4,5,9,15};
        int i=0,j=0,sumA=0,sumB=0,maxSum=0;
        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]<ar2[j])
            {
                sumA+=ar1[i];
                i++;
            }
            else if(ar2[j]<ar1[i])
            {
                sumB+=ar2[j];
                j++;
            }
            else if(ar1[i]==ar2[j])
            {
                if(sumA>sumB)
                {
                    maxSum+=sumA+ar1[i];
                }
                else
                {
                    maxSum+=sumB+ar1[i];
                }
                i++;
                j++;
                sumA=0;
                sumB=0;
            }
        }
        while(i<ar1.length)
        {
            maxSum+=ar1[i];
            i++;
        }
        while(j<ar2.length)
        {
            maxSum+=ar2[j];
            j++;
        }
        System.out.println(maxSum);
    }
}

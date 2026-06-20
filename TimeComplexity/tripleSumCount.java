package TimeComplexity;

import java.util.Arrays;

public class tripleSumCount
{
    static int meth(int[] ar,int x)
    {
        int i,j,tripleSumCount = 0, counti = 1, countj = 1, sum,n=ar.length;
        for(int k=0;k<n-2;k++)
        {
             i = k+1;
             j=n-1;
            while (i < j) {
                sum = ar[k]+ar[i] + ar[j];
                if (sum < x)
                {
                    i++;
                }
                else if (sum > x)
                {
                    j--;
                }
                else if (sum == x && ar[j] == ar[j - 1] && (j - i) != 1)
                {
                    j--;
                    countj++;
                }
                else if (sum == x && ar[i] == ar[i + 1] && (j - i) != 1)
                {
                    i++;
                    counti++;
                }
                else if (sum == x)
                {
                    tripleSumCount += (counti * countj);
                    i++;
                    j--;
                    counti = 1;
                    countj = 1;
                }
            }
        }
        return tripleSumCount;
    }
    public static void main(String[] args)
    {
        int ar[]={2,-5,8,-6,0,5,10,11,-3};
        int x=10;
        Arrays.sort(ar);
        System.out.println(meth(ar,x));
    }
}

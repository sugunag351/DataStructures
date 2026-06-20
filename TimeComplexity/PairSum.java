package TimeComplexity;

import java.util.Arrays;

public class PairSum
{
    static int meth(int[] ar,int x)
    {
        int i=0,j=ar.length-1,pairSumCount=0,counti=1,countj=1,sum;
        while(i<j)
        {
            sum=ar[i]+ar[j];
            if(sum<x)
            {
                i++;
            }
            else if(sum>x)
            {
                j--;
            }
            else if(sum==x && ar[j]==ar[j-1] && (j-i)!=1)
            {
                j--;
                countj++;
            }
            else if(sum==x && ar[i]==ar[i+1] && (j-i)!=1)
            {
                i++;
                counti++;
            }
            else if(sum==x)
            {
                pairSumCount+=(counti*countj);
                i++;
                j--;
                counti=1;
                countj=1;
            }
        }
        return pairSumCount;
    }
    public static void main(String[] args)
    {
        int ar[]={1,3,6,2,5,4,3,2,4};
        int x=7;
        Arrays.sort(ar);
        System.out.println(meth(ar,x));
    }
}

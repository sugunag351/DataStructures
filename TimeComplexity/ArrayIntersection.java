package TimeComplexity;

import java.util.Arrays;

public class ArrayIntersection
{
    // this approach is better when the arrays have duplicates
    //and when the two arrays are larger in size
    //overall this is the better approach
    // time complexity for sorting two arrays O(nlogn+mlogm)
    // and intersection using two pointer approach O(n+m)
    public static void main(String[] args)
    {
        int ar1[]={2,8,6,4,3,5,2};
        int ar2[]={1,2,9,3,4,5,6,2};
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int n=ar1.length,m=ar2.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if (ar1[i] == ar2[j])
            {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
            }
            else if (ar1[i] < ar2[j])
            {
                i++;
            }
            else if (ar2[j] < ar1[i])
            {
                j++;
            }
        }
    }
}

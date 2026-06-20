package TimeComplexity;

public class ArrayInterSectionLinearSearch
{
    public static void main(String[] args)
    {
        int[] ar1 = {1, 2, 3, 4, 5, 6};
        int[] ar2 = {2, 3,3, 4, 5};
        boolean[] visited = new boolean[ar2.length];
        for (int i = 0; i < ar1.length; i++)
        {
            for (int j = 0; j < ar2.length; j++)
            {
                if (ar1[i] == ar2[j] && !visited[j])
                {
                    System.out.print(ar1[i] + " ");
                    visited[j] = true;
                    break;
                }
            }
        }
    }
}

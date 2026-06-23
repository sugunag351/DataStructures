package GenericTrees;

public class SumOfAllNodes
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(sumOfAllNode(root));
    }

    public static int sumOfAllNode(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }

        int sum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            int childSum=sumOfAllNode(root.children.get(i));
            sum+=childSum;
        }
        return sum;
    }
}

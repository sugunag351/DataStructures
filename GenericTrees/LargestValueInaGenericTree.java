package GenericTrees;

public class LargestValueInaGenericTree
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(max(root));
    }
    public static int max(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int max= root.data;;
        for(int i=0;i<root.children.size();i++)
        {
            int childAns=max(root.children.get(i));
            if(childAns>max)
            {
                max=childAns;
            }
        }
        return max;
    }
}

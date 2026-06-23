package GenericTrees;

public class CountLeafNodes
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(countLeafNodes(root));
    }
    public static int countLeafNodes(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }

        if(root.children.size()==0)
        {
            return 1;
        }

        int count=0;
        for(int i=0;i<root.children.size();i++)
        {
            int childCount=countLeafNodes(root.children.get(i));
            count+=childCount;
        }
        return count;
    }
}

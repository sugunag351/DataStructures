package GenericTrees;

public class ReplaceNodeWithDepth
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root= GenericTreeUse.takeInputLevelWise();
        replaceWithDepthValue(root);
        GenericTreeUse.printLevelWise(root);
    }
    public static void replaceWithDepthValue(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        helper(root,0);
    }
    public static void helper(TreeNode<Integer> root,int depth)
    {
        root.data=depth;
        for(int i=0;i<root.children.size();i++)
        {
            helper(root.children.get(i) , depth+1);
        }
    }
}

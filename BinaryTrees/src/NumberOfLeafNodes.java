public class NumberOfLeafNodes
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println("Leaf Node Count:"+leafNodeCount(root));
    }
    /*
    public static int leafNodeCount(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftCount=leafNodeCount(root.left);
        int rightCount=leafNodeCount(root.right);
        if(root.left==null && root.right==null)
        {
            return leftCount+rightCount+1;
        }
        return leftCount+rightCount;
    }

     */
    public static int leafNodeCount(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return leafNodeCount(root.left)+leafNodeCount(root.right);
    }
}

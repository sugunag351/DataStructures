package BinaryTrees;

public class NumberOfNodesInaBinaryTree
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeTreeInput(true,0,true);
        System.out.println("Number of nodes in a tree:"+numberOfNodes(root));
    }
    public static int numberOfNodes(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodeCount=numberOfNodes(root.left);
        int rightNodeCount=numberOfNodes(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
}

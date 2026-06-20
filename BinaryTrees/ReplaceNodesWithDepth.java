package BinaryTrees;

public class ReplaceNodesWithDepth
{
    public static void main(String[] args)
    {
       BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
       changeToDepthTree(root,0);
       BinaryTreeUse.printLevelWise(root);
    }
    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth)
    {
        if(root==null)
        {
            return;
        }
        root.data=depth;
        changeToDepthTree(root.left,depth+1);
        changeToDepthTree(root.right,depth+1);
    }
}

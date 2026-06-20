package BinaryTrees;

public class NodesWithoutSiblings
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printNodesWithoutSibling(root);
    }
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return;
        }
        if(root.left!=null && root.right==null)
        {
            System.out.print(root.left.data+" ");
        }
        else if(root.left==null && root.right!=null)
        {
            System.out.print(root.right.data+" ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}

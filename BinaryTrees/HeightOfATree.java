package BinaryTrees;

public class HeightOfATree
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println("Height of a Tree is:"+height(root));
    }
    //Height of tree = number of levels in a tree
    public static int height(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}

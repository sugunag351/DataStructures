package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class CheckBinaryTreeIsBalancedOrNot
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        System.out.println(isBalanced(root));
    }
    //A binary tree is balanced if ( |leftHeight - rightHeight| <= 1 ) for every node.
    //Time complexity O(n2)
    public static boolean isBalanced(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return true;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1)
        {
            return false;
        }

        boolean isLeftBalanced=isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;

    }
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+Math.max(leftHeight,rightHeight);
    }
}

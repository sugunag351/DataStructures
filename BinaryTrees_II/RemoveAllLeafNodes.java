package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class RemoveAllLeafNodes
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        root=removeLeaves(root);
        BinaryTreeUse.printLevelWise(root);
    }
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return null;
        }

        if(root.left==null && root.right==null)
        {
            return null;
        }

        root.left=removeLeaves(root.left);
        root.right=removeLeaves(root.right);

        return root;
    }
}

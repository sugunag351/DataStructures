package BinarySearchTree_I;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class ReplaceWithSumOfGreaterNodes
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        replaceWithLargerNodesSum(root);
        BinaryTreeUse.printLevelWise(root);
    }
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        helper(root,0);

    }
    private static int helper(BinaryTreeNode<Integer> root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        int rightSum=helper(root.right,sum);

        int temp=root.data;
        root.data=sum+rightSum+root.data;

        int leftSum=helper(root.left,root.data);

        return leftSum+rightSum+temp;
    }
}

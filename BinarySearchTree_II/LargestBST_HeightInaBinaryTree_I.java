package BinarySearchTree_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class LargestBST_HeightInaBinaryTree_I
{
    public static void main(String[] args)
    {
         BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
         int height=largestBSTSubtree(root);
         System.out.println(height);
    }
    /*
        | Case                     | Time Complexity | Space Complexity |
        | ------------------------ | --------------- | ---------------- |
        | Balanced Tree            | O(n log n)      |   O(log n)       |
        | Skewed Tree (Worst Case) | (n²)            |   O(n)           |

     */

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return 0;
        }

        boolean isBST=checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(isBST)
        {
            int height=getHeight(root);
            return height;
        }


        int  leftAns=largestBSTSubtree(root.left);
        int rightAns=largestBSTSubtree(root.right);
        return Math.max(leftAns,rightAns);
    }
    private static boolean checkBST(BinaryTreeNode<Integer> root,int minRange,int maxRange)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=minRange || root.data>maxRange)
        {
            return false;
        }
        boolean leftAns=checkBST(root.left,minRange,root.data-1);
        boolean rightAns=checkBST(root.right,root.data,maxRange);

        return leftAns && rightAns;
    }
    private static int getHeight(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
}

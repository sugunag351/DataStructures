package BinarySearchTree_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

class BSTReturn
{
    int min;
    int max;
    boolean isBST;
    int height;
    BSTReturn(int min,int max,boolean isBST,int height)
    {
        this.min=min;
        this.max=max;
        this.isBST=isBST;
        this.height=height;
    }
}
/*
       | Case                     | Time Complexity | Space Complexity |
       | ------------------------ | --------------- | ---------------- |
       | Balanced Tree            |    O(n)         |   O(log n) =O(h) |
       | Skewed Tree (Worst Case) |    O(n)         |   O(n)           |

    */
public class LargestBST_HeightInaBinaryTree_II
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        int height=largestBSTSubtree(root);
        System.out.println(height);
    }
    /*
     current subtree is a BST.
    1.if (Left subtree is BST) && (right subtree is BST)
               2.(Maximum value in left subtree < root) && (Minimum value in right subtree ≥ root)
                   =>if both of these conditions are true then current subtree is BST.
                   =>then calculate height of the current subtree
     */
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {

        BSTReturn ans=helper(root);
        return ans.height;

    }

    private static BSTReturn helper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            BSTReturn ans=new BSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
            return ans;
        }
        BSTReturn leftAns=helper(root.left);
        BSTReturn rightAns=helper(root.right);

        boolean isBST=false;
        int height=Math.max(leftAns.height,rightAns.height);

        if(leftAns.isBST && rightAns.isBST)
        {
            if(leftAns.max<root.data && rightAns.min>=root.data)
            {
                height=1+Math.max(leftAns.height,rightAns.height);
                isBST=true;
            }
        }

        int min=Math.min(root.data,Math.min(leftAns.min,rightAns.min));
        int max=Math.max(root.data,Math.max(leftAns.max,rightAns.max));

        BSTReturn ans=new BSTReturn(min,max,isBST,height);
        return ans;
    }

}

package BinarySearchTree_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class PairSumInaBST_I
{
    public static void main(String[] args)
    {
       BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
       printNodesSumToS(root,3);
    }
    //O(h)=O(logn) => (h=height of tree) ,(n=number of nodes in BST)
    /*
        | Approach               | Balanced BST Time | Balanced BST Space | Skewed BST Time | Skewed BST Space |
        | ---------------------- | ----------------- | ------------------ | --------------- | ---------------- |
        | Brute Force            | O(n log n)        | O(log n)           | O(n²)           | O(n)             |

*/
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        if(root==null)
        {
            return;
        }
        helper(root,s,root);
    }

    private static void helper(BinaryTreeNode<Integer> root,int s,BinaryTreeNode<Integer> curr)
    {
        if(curr==null)
        {
            return;
        }
        int x=s-curr.data;

        if(curr.data<x && search(root,x))
        {
            System.out.println(curr.data+" "+x);
        }
        helper(root,s,curr.left);
        helper(root,s,curr.right);

    }

    private static boolean search(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
        {
            return false;
        }
        if(x==root.data)
        {
            return true;
        }
        if(x<root.data)
        {
            return search(root.left,x);
        }
        else
        {
            return search(root.right,x);
        }
    }
}

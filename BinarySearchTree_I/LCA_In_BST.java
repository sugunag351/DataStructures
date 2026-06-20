package BinarySearchTree_I;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

import java.util.*;
public class LCA_In_BST
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        System.out.println(getLCA(root,2,3));
    }
    //Time complexity O(h) ,h=height of tree
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b)
    {
        boolean aExists=search(root,a);
        boolean bExists=search(root,b);

        if(!aExists && bExists)
        {
            return b;
        }
        else if(!bExists && aExists)
        {
            return a;
        }
        else if(!aExists && !bExists)
        {
            return -1;
        }
        else
        {
            return helper(root,a,b);
        }
    }

    private static int helper(BinaryTreeNode<Integer> root,int a,int b)
    {
        if(root==null)
        {
            return -1;
        }
        if(a<root.data && b<root.data)
        {
            return helper(root.left,a,b);
        }
        else if(a>root.data && b> root.data)
        {
            return helper(root.right,a,b);
        }
        else
        {
            return root.data;
        }
    }

    //Search function
    private static boolean search(BinaryTreeNode<Integer> root,int target)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==target)
        {
            return true;
        }
        if(target<root.data)
        {
            return search(root.left,target);
        }
        else
        {
            return search(root.right,target);
        }
    }

}

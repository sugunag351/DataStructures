package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

import java.util.*;
public class PathSumRootToLeaf
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        rootToLeafPathsSumToK(root,13);
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

        ArrayList<Integer> path=new ArrayList<>();
        helper(root,k,path);

    }
    public static void helper(BinaryTreeNode<Integer> root,int k,ArrayList<Integer> path)
    {
        //Base case
        if(root==null)
        {
            return;
        }

        //Add current node to path
        path.add(root.data);

        //check if current node is Leaf
        if(root.left==null && root.right==null)
        {
            //check if path sum becomes k
            if(k==root.data)
            {
                for(int num:path)
                {
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        }

        //Explore left subtree
        helper(root.left, k-root.data, path);

        //Explore right subtree
        helper(root.right, k-root.data, path);

        //Backtracking:Remove current node before returning
        path.remove(path.size()-1);
    }
}

package BinaryTrees_II;

import java.util.ArrayList;
import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;
public class LongestLeafToRootPath
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        ArrayList<Integer> path=longestRootToLeafPath(root);
        for(int x:path)
        {
            System.out.print(x+" ");
        }
    }
    /*
    1.If root == null, return an empty list.
    2.Recursively get the longest path from the left subtree.
    3.Recursively get the longest path from the right subtree.
    4.Compare their lengths.
    5.Add the current root's data to the longer path and return it.
     */
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            ArrayList<Integer> path=new ArrayList<>();
            return path;
        }
        ArrayList<Integer> leftPath=longestRootToLeafPath(root.left);
        ArrayList<Integer> rightPath=longestRootToLeafPath(root.right);
        if(leftPath.size()>rightPath.size())
        {
            leftPath.add(root.data);
            return leftPath;
        }
        else
        {
            rightPath.add(root.data);
            return rightPath;
        }

    }
}

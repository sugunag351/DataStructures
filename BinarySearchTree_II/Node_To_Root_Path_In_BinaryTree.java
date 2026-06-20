package BinarySearchTree_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

import java.util.ArrayList;

public class Node_To_Root_Path_In_BinaryTree
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        ArrayList<Integer> path=nodeToRootPath(root,5);
        if(path==null)
        {
            System.out.println("Node not found");
        }
        else
        {
            for(int i:path)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int node)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==node)
        {
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput=nodeToRootPath(root.left,node);
        if(leftOutput!=null)
        {
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput=nodeToRootPath(root.right,node);
        if(rightOutput!=null)
        {
            rightOutput.add(root.data);
            return rightOutput;
        }

        return null;
    }
}

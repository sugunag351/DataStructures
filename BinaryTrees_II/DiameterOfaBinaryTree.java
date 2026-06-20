package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

class Pair
{
    int height;
    int diameter;
}
/*
  => Diameter of a binary tree is the maximum distance between any two leaf nodes in a tree
  => Diameter : may pass through root
                 may not pass through root
  => Here, the distance is measured in terms of the total number of nodes present
     along the path of the two leaf nodes, including both the leaves.

  =>If there is only one leaf node, then:
     Diameter is the path from root to that leaf node.
     Because there are not two different leaf nodes available.

 */

public class DiameterOfaBinaryTree
{
    public static void main(String[] args)
    {
       BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
       System.out.println(diameterOfBinaryTree(root));
    }
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){

        return diameter(root).diameter;

    }
    public static Pair diameter(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            Pair ans=new Pair();
            ans.height=0;
            ans.diameter=0;
            return ans;
        }
        Pair leftOutput=diameter(root.left);
        Pair rightOutput=diameter(root.right);

        int currHeight=Math.max(leftOutput.height,rightOutput.height)+1;

        int currDiameter=leftOutput.height+rightOutput.height+1;
        int leftDiameter=leftOutput.diameter;
        int rightDiameter=rightOutput.diameter;

        int maxDiameter =Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));

        Pair ans=new Pair();
        ans.height=currHeight;
        ans.diameter=maxDiameter;
        return ans;

    }
}


package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

class PAIR<T,U>
{
    T minimum;
    U maximum;
    PAIR(T minimum, U maximum)
    {
        this.minimum=minimum;
        this.maximum=maximum;
    }
}
public class MinimumAndMaximumInBinaryTree
{
    public static void main(String[] args)
    {
         BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
         PAIR<Integer,Integer> ans=getMinAndMax(root);
         System.out.println("MIN_VALUE:"+ans.minimum+"\nMAX_VALUE:"+ans.maximum);
    }
    public static PAIR<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            PAIR<Integer,Integer> ans=new PAIR<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            return ans;
        }

        PAIR<Integer,Integer> leftOutput=getMinAndMax(root.left);
        PAIR<Integer,Integer> rightOutput=getMinAndMax(root.right);

        int min=Math.min(root.data,Math.min(leftOutput.minimum,rightOutput.minimum));
        int max=Math.max(root.data,Math.max(leftOutput.maximum,rightOutput.maximum));

        PAIR<Integer,Integer> ans=new PAIR<>(min,max);

        return ans;
    }
}


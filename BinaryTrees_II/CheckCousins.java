package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCousins
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        System.out.println(isCousin(root,2,3));
    }
    /*
    1.Perform a level-order traversal (BFS) using a queue.
    2.For each level, check whether nodes p and q are present in that level.
    3.While processing a node, check if its left and right children are p and q; if yes, return false (they are siblings).
    4.After processing the level, if both p and q are found, return true; if only one is found, return false.
    5.If the traversal ends without finding them at the same level, return false.
     */
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q)
    {

        if(root==null)
        {
            return false;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size=queue.size();
            boolean pFound=false;
            boolean qFound=false;
            for(int i=0;i<size;i++)
            {
                BinaryTreeNode<Integer> current=queue.poll();
                if(current.left!=null && current.right!=null)
                {
                    int leftData=current.left.data;
                    int rightData=current.right.data;
                    if((leftData==p && rightData==q) || (leftData==q && rightData==p))
                    {
                        return false;
                    }
                }
                if(current.data==p)
                {
                    pFound=true;
                }
                if(current.data==q)
                {
                    qFound=true;
                }


                if(current.left!=null)
                {
                    queue.add(current.left);
                }
                if(current.right!=null)
                {
                    queue.add(current.right);
                }

            }
            //level completed
            if(pFound && qFound)
            {
                return true;
            }
            if(pFound || qFound)
            {
                return false;
            }
        }
        return false;

    }
}

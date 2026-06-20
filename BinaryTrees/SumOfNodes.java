package BinaryTrees;

import java.util.*;
public class SumOfNodes
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println("Sum of all nodes in a tree:"+getSum(root));
    }
    public static int getSum(BinaryTreeNode<Integer> root)
    {

        int sum=0;

        if(root==null)
        {
            return sum;
        }

        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            BinaryTreeNode<Integer> front=queue.poll();
            sum=sum+front.data;
            if(front.left!=null)
            {
                queue.add(front.left);
            }
            if(front.right!=null)
            {
                queue.add(front.right);
            }
        }
        return sum;
    }
}

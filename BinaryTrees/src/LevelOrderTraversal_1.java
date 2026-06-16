import java.util.*;
public class LevelOrderTraversal_1
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printLevelWise(root);
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            //Here size is:Number of nodes currently present in that level
            int size=queue.size();

            for(int i=0;i<size;i++)
            {
                BinaryTreeNode<Integer> front=queue.poll();
                System.out.print(front.data+" ");

                if(front.left!=null)
                {
                    queue.add(front.left);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                }

            }
            /*
                =>After this loop finishes
                =>Entire current level has been processed
            */
            //Print a newline
            System.out.println();
        }
    }
}

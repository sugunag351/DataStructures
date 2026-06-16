import java.util.*;
public class LevelOrderTraversal_2
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printLevelWise(root);
    }
    /*
    =>Add the root to the queue.
    =>Add null after it to mark the end of the first level.
    =>When a null is encountered:
         ->Print a new line.
         ->If the queue is not empty, add another null to mark the next level's end.
    =>For each non-null node:
          ->Print its data.
          ->Add its left and right children (if they exist).
     */
    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty())
        {
            BinaryTreeNode<Integer> front=queue.poll();
            if(front==null)
            {
                System.out.println();
                if(queue.size()!=0)
                {
                    queue.add(null);
                }

            }
            else
            {
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
        }

    }
}

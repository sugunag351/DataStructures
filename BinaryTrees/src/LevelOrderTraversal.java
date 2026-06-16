import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        levelOrder(root);
    }
    public static void levelOrder(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }

        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
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
    }
}

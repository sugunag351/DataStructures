import java.util.*;
public class LevelWiseLinkedList
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        ArrayList<Node<Integer>> arr=constructLinkedListForEachLevel(root);
        for (Node<Integer> head:arr)
        {
            LinkedListUse.print(head);
        }
    }
    public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){

        ArrayList<Node<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }

        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);


        while(!queue.isEmpty())
        {
            Node<Integer> head=null,temp=null;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                BinaryTreeNode<Integer> front=queue.poll();
                Node<Integer> newNode=new Node<>(front.data);
                if(head==null)
                {
                    head=newNode;
                    temp=head;
                }
                else
                {
                    temp.next=newNode;
                    temp=temp.next;
                }

                if(front.left!=null)
                {
                    queue.add(front.left);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                }
            }
            arr.add(head);
        }
        return arr;

    }
}

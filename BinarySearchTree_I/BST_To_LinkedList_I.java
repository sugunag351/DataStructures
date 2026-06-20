
package BinarySearchTree_I;
import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;
import LinkedList.LinkedListUse;
import LinkedList.Node;

class Pair
{
    Node<Integer> head;
    Node<Integer> tail;
    Pair(Node<Integer> head,Node<Integer> tail)
    {
        this.head=head;
        this.tail=tail;
    }
}

      //Each subtree(left and right) returns head and tail
      //leftTail-> current-> rightHead
public class BST_To_LinkedList_I
{
    public static void main(String[] args)
    {
         BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
         Node<Integer> head=constructLinkedList(root);
         LinkedListUse.print(head);
    }
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root)
    {
        Pair ans=helper(root);
        return ans.head;
    }
    public static Pair helper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return new Pair(null,null);
        }

        Pair leftOutput=helper(root.left);
        Pair rightOutput=helper(root.right);

        Node<Integer> current=new Node<>(root.data);

        if(leftOutput.head==null)
        {
            leftOutput.head=current;
            leftOutput.tail=current;

            current.next=rightOutput.head;
        }
        else
        {
            leftOutput.tail.next=current;
            current.next=rightOutput.head;

        }

        if(rightOutput.tail==null)
        {
            rightOutput.tail=current;
        }
        return new Pair(leftOutput.head,rightOutput.tail);
    }
}

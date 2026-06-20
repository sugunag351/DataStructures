package BinarySearchTree_I;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;
import LinkedList.LinkedListUse;
import LinkedList.Node;

public class BST_To_LinkedList_II
{
    public static void main(String[] args)
    {
          BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
          Node<Integer> head=constructLinkedList(root);
          LinkedListUse.print(head);
    }
    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root)
    {
        Node<Integer> dummy=new Node<>(0);

        helper(root,dummy);
        return dummy.next;
    }
    public static Node<Integer> helper(BinaryTreeNode<Integer> root,Node<Integer> tail)
    {
        if(root==null)
        {
            return tail;
        }

        //Explore left subtree
        Node<Integer> leftOutput=helper(root.left,tail);

        Node<Integer> current=new Node<>(root.data);

        leftOutput.next=current;

        //Explore right subtree
        Node<Integer> rightOutput=helper(root.right,current);

        return rightOutput;
    }
}

package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class ReverseKnodes
{
    public static void main(String[] args)
    {
         Node<Integer> head= LinkedListUse.takeInput();
         head=kReverse(head,4);
         LinkedListUse.print(head);
    }
    public static Node<Integer> kReverse(Node<Integer> head,int k)
    {
        if(head==null || k==0)
        {
            return head;
        }
        Node<Integer> curr=head;
        Node<Integer> prev=null;
        Node<Integer> next=null;

        int count=0;
        //Reverse first K nodes
        while(count<k && curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        //Recursive Call for remaining list
        if(next!=null)
        {
            head.next=kReverse(next,k);
        }
        //Return New Head
        return prev;
    }
}

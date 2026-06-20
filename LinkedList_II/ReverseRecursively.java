package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class ReverseRecursively
{

    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=reverseRec(head);
        LinkedListUse.print(head);
    }
    //Time Complexity O(n2)
    public static Node<Integer> reverseRec(Node<Integer> head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        else
        {
            Node<Integer> smallerHead=reverseRec(head.next);
            Node<Integer> tail=smallerHead;
            while(tail.next!=null)
            {
                tail=tail.next;
            }
            tail.next=head;
            head.next=null;
            return smallerHead;
        }
    }
}

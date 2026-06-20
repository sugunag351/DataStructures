package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class DeleteNodeRecursively
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=deleteNodeRec(head,2);
        LinkedListUse.print(head);
    }
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if((head==null || head.next==null) && pos>0)
        {
            return head;
        }
        if(pos==0)
        {
            return head.next;
        }
        if(pos==1)
        {
            head.next=head.next.next;
            return head;
        }
        else
        {
            Node<Integer> smallerHead=deleteNodeRec(head.next,pos-1);
            head.next=smallerHead;
            return head;
        }
    }
}

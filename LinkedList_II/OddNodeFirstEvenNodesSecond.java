package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class OddNodeFirstEvenNodesSecond
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=evenAfterOdd(head);
        LinkedListUse.print(head);
    }
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {

        if(head==null)
        {
            return head;
        }
        Node<Integer> temp=head;
        Node<Integer> oddHead=null,oddTail=null,evenHead=null,evenTail=null;
        while(temp!=null)
        {
            if(temp.data%2!=0 && oddHead==null)
            {
                oddHead=temp;
                oddTail=temp;
            }
            else if(temp.data%2==0 && evenHead==null)
            {
                evenHead=temp;
                evenTail=temp;
            }
            else if(temp.data%2!=0)
            {
                oddTail.next=temp;
                oddTail=oddTail.next;
            }
            else
            {
                evenTail.next=temp;
                evenTail=evenTail.next;
            }
            temp=temp.next;
        }
        if(evenHead==null || oddHead==null)
        {
            return head;
        }
        oddTail.next=null;
        evenTail.next=null;
        oddTail.next=evenHead;
        return oddHead;
    }
}

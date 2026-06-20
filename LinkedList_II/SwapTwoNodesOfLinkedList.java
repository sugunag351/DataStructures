package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class SwapTwoNodesOfLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=swapNodes(head,2,3);
        LinkedListUse.print(head);
    }
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {

        if(i==j)
        {
            return head;
        }
        if(i>j)
        {
            int temp=i;
            i=j;
            j=temp;
        }
        Node<Integer> tail=head,temp=null,p1=null,c1=null,p2=null,c2=null;
        int pos=0;
        while(tail!=null)
        {
            if(pos==i-1)
            {
                p1=tail;
            }
            else if(pos==i)
            {
                c1=tail;
            }
            else if(pos==j-1)
            {
                p2=tail;
            }
            else if(pos==j)
            {
                c2=tail;
            }
            pos++;
            tail=tail.next;
        }
        //Head node and adjacent node
        if(i==0 && j-i==1)
        {
            temp=c2.next;
            c2.next=c1;
            c1.next=temp;
            return c2;
        }
        // Head node and non-adjacent node
        if(i==0)
        {
            temp=c2.next;
            c2.next=c1.next;
            p2.next=c1;
            c1.next=temp;
            return c2;
        }
        //Non-head node and Adjacent Nodes
        if(j-i==1)
        {
            temp=c2.next;
            p1.next=c2;
            c2.next=c1;
            c1.next=temp;
            return head;
        }
        //Non-head node and Non-Adjacent Nodes
        temp=c1.next;
        p1.next=c2;
        p2.next=c1;
        c1.next=c2.next;
        c2.next=temp;
        return head;
    }
}

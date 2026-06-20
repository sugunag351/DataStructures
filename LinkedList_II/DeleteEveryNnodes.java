package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class DeleteEveryNnodes
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=skipMdeleteN(head,2,3);
        LinkedListUse.print(head);
    }
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        //Retain M nodes After Deleting every N nodes
        if(head==null || M==0)
        {
            return null;
        }
        if(N==0)
        {
            return head;
        }
        int tm=M,tn=N;
        Node<Integer> temp=head,tail=head;
        while(temp!=null)
        {
            if(tm>1)
            {
                tm--;
            }
            else if(tm==1)
            {
                tail=temp;
                tm=0;
            }
            else if(tn>0)
            {
                tn--;
            }
            else if(tn==0)
            {
                tail.next=temp;
                tm=M;
                tn=N;
                tm--;
            }
            temp=temp.next;
        }
        if(tn==N)
        {
            return head;
        }
        tail.next=null;
        return head;
    }
}

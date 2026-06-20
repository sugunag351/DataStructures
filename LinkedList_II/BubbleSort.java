package LinkedList_II;

import LinkedList.LinkedListUse;
import LinkedList.Node;

public class BubbleSort
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=bubbleSort(head);
        LinkedListUse.print(head);
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {

        int len=length(head);
        for(int i=0;i<len;i++)
        {
            Node<Integer> prev=null,curr=head,temp=null;
            while(curr.next!=null)
            {

                if(curr.data > curr.next.data)
                {
                    //Not begining Node
                    if(prev!=null)
                    {
                        prev.next=curr.next;
                        temp=curr.next;
                        curr.next=temp.next;
                        temp.next=curr;
                        prev=temp;
                    }
                    //Begining Node
                    else
                    {
                        temp=curr.next;
                        curr.next=temp.next;
                        temp.next=curr;
                        head=temp;
                        prev=head;
                    }
                }
                else
                {
                    prev=curr;
                    curr=curr.next;
                }

            }
        }
        return head;
    }

    //Find the length of the linked list
    public static int length(Node<Integer> head)
    {
        if(head==null)
        {
            return 0;
        }
        return length(head.next)+1;
    }
}

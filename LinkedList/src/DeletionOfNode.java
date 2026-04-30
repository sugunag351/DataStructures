public class DeletionOfNode
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        LinkedListUse.print(head);

        head=deleteNode(head,2);
        LinkedListUse.print(head);
    }
    //Delete a node in linkedlist At specific position
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
        // Write your code here.
        if(head==null)
        {
            return head;
        }
        Node<Integer> temp1=head,temp2=null;
        if(pos==0)
        {
            head=temp1.next;
            temp1.next=null;
        }
        else
        {
            for(int i=0;i<pos-1;i++)
            {
                if(temp1.next==null)
                {
                    return head;
                }
                else
                {
                    temp1=temp1.next;
                }
            }
            if(temp1.next!=null)
            {
                temp2=temp1.next;
                temp1.next=temp2.next;
                temp2.next=null;
            }
        }
        return head;
    }
}

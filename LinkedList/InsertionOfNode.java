package LinkedList;

public class InsertionOfNode
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        LinkedListUse.print(head);

        head=insert(head,2,10);
        LinkedListUse.print(head);

    }
    //insert node into linked list at specific position
    public static Node<Integer> insert(Node<Integer> head, int pos, int data)
    {
        Node<Integer> newNode=new Node<>(data);
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {
            Node<Integer> temp=head;
            for(int i=0;i<pos-1;i++)
            {
                if(temp.next==null) {
                    return head;
                }
                else
                {
                    temp=temp.next;
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }
}

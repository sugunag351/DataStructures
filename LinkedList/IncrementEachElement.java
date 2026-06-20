package LinkedList;

public class IncrementEachElement
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        increment(head);
        LinkedListUse.print(head);

    }
    public static void increment(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
        }
    }
}

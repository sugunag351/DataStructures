public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        head=reverse(head);
        LinkedListUse.print(head);
    }
    public static Node<Integer> reverse(Node<Integer> head) {
        if(head==null)
        {
            return head;
        }
        Node<Integer> curr=head;
        Node<Integer> prev=null;
        Node<Integer> Next=curr.next;
        while(Next!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=Next;
            Next=curr.next;
        }
        curr.next=prev;
        return curr;
    }
}

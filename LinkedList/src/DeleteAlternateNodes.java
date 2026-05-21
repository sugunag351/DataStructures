public class DeleteAlternateNodes
{
    public static void main(String[] args)
    {
         Node<Integer> head=LinkedListUse.takeInput();
         deleteAlternateNodes(head);
         LinkedListUse.print(head);
    }
    public static void deleteAlternateNodes(Node<Integer> head) {

        Node<Integer> temp=head;
        while(temp!=null && temp.next!=null)
        {
            temp.next=temp.next.next;
            temp=temp.next;
        }
    }
}

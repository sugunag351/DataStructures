public class MergeSortedLinkedLists
{
    public static void main(String[] args)
    {
        Node<Integer> head1=LinkedListUse.takeInput();
        Node<Integer> head2=LinkedListUse.takeInput();
        Node<Integer> head=mergeTwoSorteds(head1,head2);
        LinkedListUse.print(head);

    }
    public static Node<Integer> mergeTwoSorteds(Node<Integer> h1, Node<Integer> h2) {

        if(h1==null)
        {
            return h2;
        }
        if(h2==null)
        {
            return h1;
        }
        Node<Integer> head=h1,tail=h1;
        if(h1.data<h2.data)
        {
            head=h1;
            tail=h1;
            h1=h1.next;
        }
        else
        {
            head=h2;
            tail=h2;
            h2=h2.next;
        }
        while(h1!=null && h2!=null)
        {
            if(h1.data < h2.data)
            {
                tail.next=h1;
                tail=tail.next;
                h1=h1.next;
            }
            else
            {
                tail.next=h2;
                tail=tail.next;
                h2=h2.next;
            }
        }
        if(h1!=null)
        {
            tail.next=h1;

        }
        else
        {
            tail.next=h2;
        }
        return head;
    }
}

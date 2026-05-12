public class FindLengthOfLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        System.out.println(length(head));
    }
    public static int length(Node<Integer> head)
    {
        Node<Integer> temp=head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}

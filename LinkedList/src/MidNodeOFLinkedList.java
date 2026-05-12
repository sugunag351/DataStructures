public class MidNodeOFLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        Node<Integer> mid=midPoint(head);
        System.out.println(mid.data);
    }
    public static Node<Integer> midPoint(Node<Integer> head)
    {
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}

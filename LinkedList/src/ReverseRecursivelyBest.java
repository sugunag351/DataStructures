public class ReverseRecursivelyBest
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        head=reverseRBest(head);
        LinkedListUse.print(head);
    }
    //Time Complexity O(n)
    public static Node<Integer> reverseRBest(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> smallHead=reverseRBest(head.next);
        head.next.next=head;
        head.next=null;
        return smallHead;
    }
}

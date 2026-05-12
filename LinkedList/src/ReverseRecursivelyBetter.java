class DoubleNode
{
    Node<Integer> head;
    Node<Integer> tail;
}
public class ReverseRecursivelyBetter
{
    public static void main(String[] args)
    {
         Node<Integer> head=LinkedListUse.takeInput();
         head=reverseRbetter(head);
         LinkedListUse.print(head);
    }
    public static DoubleNode reverseR(Node<Integer> head)
    {
        DoubleNode ans;
        if(head==null || head.next==null)
        {
            ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        else
        {
            DoubleNode smaller=reverseR(head.next);
            smaller.tail.next=head;
            head.next=null;
            ans=new DoubleNode();
            ans.head=smaller.head;
            ans.tail=head;
            return ans;
        }
    }
    public static Node<Integer> reverseRbetter(Node<Integer> head)
    {
        DoubleNode ans=reverseR(head);
        return ans.head;
    }

}



package LinkedList;

public class AppendLastNnodesToFirst
{
    public static void main(String[] args)
    {
        Node<Integer> head= LinkedListUse.takeInput();
        head=appendLastNToFirst(head,3);
        LinkedListUse.print(head);
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n)
    {

        if(n==0 || head==null)
        {
            return head;
        }
        Node<Integer> slow=head,fast=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;

        return head;
    }
}

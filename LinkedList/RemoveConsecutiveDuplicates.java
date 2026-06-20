package LinkedList;

public class RemoveConsecutiveDuplicates
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        head=removeDuplicates(head);
        LinkedListUse.print(head);
    }
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head==null)
        {
            return head;
        }
        Node<Integer> currNode=head,temp=null;
        while(currNode.next!=null)
        {
            if(currNode.data.equals(currNode.next.data))
            {
                temp=currNode.next.next;
                currNode.next.next=null;
                currNode.next=temp;
            }
            else
            {
                currNode=currNode.next;
            }
        }
        return head;
    }
}

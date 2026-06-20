package LinkedList;

public class PalindromeLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(Node<Integer> head) {
		/*
		1.find the mid node of the linked list using fast and slow pointers
		2.reverse the second half of the list
		3.compare the first half and second half of the nodes
		*/
        if(head==null || head.next==null)
        {
            return true;
        }
        Node<Integer> temp1=head;
        Node<Integer> mid=getMidList(head);
        Node<Integer> temp2=reverse(mid);
        while(temp1!= null && temp2!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
    //Finding mid node of the linked list
    public static Node<Integer> getMidList(Node<Integer> head)
    {
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //Reverse the second half of the list
    public static Node<Integer> reverse(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> curr=head,prev=null,Next=curr.next;
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

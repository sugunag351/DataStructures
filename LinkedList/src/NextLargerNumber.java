public class NextLargerNumber
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        head=nextLargerNumber(head);
        LinkedListUse.print(head);

    }
    /*
          1.Reverse Linked List
          2.Add 1 normally
          3.Reverse linked list Again
    */
    public static Node<Integer> nextLargerNumber(Node<Integer> head)
    {
        //step1: Reverse linked list
        head=reverse(head);
        Node<Integer> temp=head;
        int carry=1;

        //step2: Add 1
        while(temp!=null)
        {
            int sum=temp.data+carry;
            temp.data=sum%10;
            carry=sum/10;

            //if no carry,stop
            if(carry==0)
            {
                break;
            }

            //if last node and carry still exists
            if(temp.next==null && carry>0)
            {
                Node<Integer> newNode=new Node<>(carry);
                temp.next=newNode;
                break;
            }

            temp=temp.next;
        }

        //step3: Reverse linked list again
        head=reverse(head);
        return head;

    }
    public static Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> prev=null;
        Node<Integer> curr=head;
        Node<Integer> nextNode;
        while (curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}

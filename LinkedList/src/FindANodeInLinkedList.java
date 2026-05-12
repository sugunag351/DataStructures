public class FindANodeInLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        LinkedListUse.print(head);
        System.out.println(findNode(head,5));
    }
    public static int findNode(Node<Integer> head, int n) {

        int pos=0;
        Node<Integer> temp=head;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                return pos;
            }
            pos++;
            temp=temp.next;
        }
        return -1;
    }
}

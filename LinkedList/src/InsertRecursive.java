public class InsertRecursive
{
    public static void main(String[] args)
    {
       Node<Integer> head=LinkedListUse.takeInput();
       head=insertR(head,20,3);
       LinkedListUse.print(head);
    }
    public static Node<Integer> insertR(Node<Integer> head,int ele,int pos)
    {
        if(head==null && pos>0)
        {
            return head;
        }
        if(pos==0)
        {
           Node<Integer> newNode=new Node<>(ele);
           newNode.next=head;
           return newNode;
        }
        else
        {
            Node<Integer> smallerHead=insertR(head.next,ele,pos-1);
            head.next=smallerHead;
            return head;
        }
    }
}

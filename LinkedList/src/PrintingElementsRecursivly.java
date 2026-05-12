public class PrintingElementsRecursivly
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        printR(head);
    }
    public static void printR(Node<Integer> head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        printR(head.next);
    }
}

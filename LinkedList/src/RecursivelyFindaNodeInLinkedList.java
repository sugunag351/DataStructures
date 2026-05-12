public class RecursivelyFindaNodeInLinkedList
{
    public static void main(String[] args)
    {
        Node<Integer> head=LinkedListUse.takeInput();
        System.out.println(findNodeRec(head,3));
    }
    public static int findNodeRec(Node<Integer> head, int n) {

        if(head==null)
        {
            return -1;
        }
        if(head.data==n)
        {
            return 0;
        }
        int pos=findNodeRec(head.next,n);
        if(pos!=-1)
        {
            return pos+1;
        }
        else
        {
            return -1;
        }
    }
}

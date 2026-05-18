
public class StackUsingLinkedList
{
    public static void main(String[] args) throws StackEmptyException
    {
        Stack<Character> stack=new Stack<>();
        char arr[]={'a','b','c','d','e'};
        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println("top element of the stack:"+stack.top());
        System.out.println("size of the stack:"+stack.size());
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}

class Node<T>
{
    T data;
    Node<T> next;
    public Node(T data)
    {
        this.data=data;
        this.next=null;
    }
}
//Inserting elements into the linked list at the begining, so that the pop operation takes O(1) time
//If we insert at the end of the list then pop opeartion takes O(n) time
class   Stack<T>
{
    private Node<T> head;
    private int size;
    public Stack()
    {
        head=null;
        size=0;
    }
    //Inserting into begining of the list,O(1)
    public void push(T ele)
    {
        Node<T> newNode=new Node<>(ele);
        newNode.next=head;
        head=newNode;
        size++;
    }
    //Deleting the top element and Returning the top element of the linkedlist
    public T pop() throws StackEmptyException
    {
        if(head==null)
        {
            throw new StackEmptyException();
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
    //return the top element of the linkedlist
    public T top()  throws StackEmptyException
    {
        if(head==null)
        {
            throw new StackEmptyException();
        }
        return head.data;
    }
    //check whether the list is empty or not
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    //Return the size of the linked list
    public int size()
    {
        return size;
    }
}

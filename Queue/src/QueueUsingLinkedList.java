public class QueueUsingLinkedList
{
   public static void main(String[] args) throws QueueEmptyException
   {
       QueueUseLL<Integer> queue=new QueueUseLL<>();
       int arr[]={1,2,3,4,5};
       for(int i=0;i<arr.length;i++)
       {
           queue.enqueue(arr[i]);
       }

       while(!queue.isEmpty())
       {
           System.out.print(queue.dequeue()+" ");
       }
       queue.enqueue(6);
       System.out.println(queue.dequeue());
   }
}
class QueueUseLL<T>
{
    private node<T> front;
    private node<T> rear;
    private int size;
    public QueueUseLL()
    {
        front=null;
        rear=null;
        size=0;
    }
    public int getSize()
    {
        return size;
    }
    public T getFront() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        return front.data;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void enqueue(T ele)
    {
        node<T> newNode=new node<>(ele);
        if(size==0)
        {
            front=newNode;
            rear=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }
    public T dequeue() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        T temp=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        size--;
        return temp;
    }

}
class node<T>
{
    T data;
    node<T> next;
    node(T data)
    {
        this.data=data;
        this.next=null;
    }
}



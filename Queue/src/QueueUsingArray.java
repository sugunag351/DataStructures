public class QueueUsingArray
{
    public static void main(String[] args) throws QueueEmptyException
    {
        QueueUse queue=new QueueUse();
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
class QueueUse
{
    private int data[];
    private int front; // front index of element at the queue
    private int rear; // rear index of element at the queue
    private int size;
    public QueueUse()
    {
        data=new int[5];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueueUse(int capacity)
    {
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    //Time Complexity O(1)
    public int getSize()
    {
        return size;
    }
    //Time Complexity O(1)
    public boolean isEmpty()
    {
        return size==0;
    }
    //Time Complexity O(1)
    public void enqueue(int ele)
    {
        if(rear==data.length-1)
        {
            increaseCapacity();
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        data[rear]=ele;
        size++;
    }
    //Time Complexity O(n)
    private void increaseCapacity()
    {
        int temp[]=data;
        data=new int[temp.length*2];
        for(int i=0;i<temp.length;i++)
        {
            data[i]=temp[i];
        }
    }
    //Time Complexity O(1)
    public int getFront() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        return data[front];
    }
    //Time Complexity O(1)
    public int dequeue() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        int value=data[front];
        front++;
        size--;
        if(size==0)
        {
            front=-1;
            rear=-1;
        }
        return value;
    }
}
class QueueEmptyException extends Exception
{

}

public class CircularQueueUsingArray
{
    public static void main(String[] args) throws QueueEmptyException
    {
        CircularQueue queue=new CircularQueue();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            queue.enqueue(arr[i]);
        }
        System.out.print(queue.dequeue()+" "+queue.dequeue()+" "+queue.dequeue()+" ");
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
    }
}
class CircularQueue
{
    private int data[];
    private int front;
    private int rear;
    private int size;
    public CircularQueue()
    {
        data=new int[5];
        rear=-1;
        front=-1;
        size=0;
    }
    public CircularQueue(int capacity)
    {
        data=new int[capacity];
        rear=-1;
        front=-1;
        size=0;
    }
    public int getSize()
    {
        return size;
    }
    public int getFront() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        return data[front];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void enqueue(int ele)
    {
        if(size==data.length)
        {
            increaseCapacity();
        }
        if(front==-1)
        {
            front=0;
        }
        /*
        rear++;
        if(rear==data.length)
        {
            rear=0;
        }
         */
        rear=(rear+1)%data.length;
        data[rear]=ele;
        size++;
    }
    private void increaseCapacity()
    {
        int temp[]=data;
        data=new int[temp.length*2];
        int index=0;
        for(int i=front;i<temp.length;i++)
        {
            data[index++]=temp[i];
        }
        for (int i=0;i<front;i++)
        {
            data[index++]=temp[i];
        }
        rear=temp.length-1;
        front=0;
    }
    public int dequeue() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        int value=data[front];
        /*
        front++;
        if(front==data.length)
        {
            front=0;
        }
         */
        front=(front+1)%data.length;
        size--;
        if(size==0)
        {
            front=-1;
            rear=-1;
        }
        return value;
    }
}

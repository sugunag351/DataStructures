package Queue;

public class DequeueUsingCircularArray
{
     public static void main(String[] args)
     {
         Dequeue dq=new Dequeue(10);
         for(int i=0;i<5;i++)
         {
             dq.insertFront(10+i);
         }
         for(int i=5;i<10;i++)
         {
             dq.insertRear(10+i);
         }

     }
}
class Dequeue
{
    private int data[];
    private int front;
    private int rear;
    private int size;
    public Dequeue(int capacity)
    {
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }


    //Insert front
    public void insertFront(int ele)
    {
        if(size==data.length)
        {
            System.out.println(-1);
            return;
        }
        //First Element
        if(size==0)
        {
            front=0;
            rear=0;
        }
        else
        {
            front=(front-1+data.length)%data.length;
        }
        data[front]=ele;
        size++;
    }

    //Insert rear
    public void insertRear(int ele)
    {
        if(size==data.length)
        {
            System.out.println(-1);
            return;
        }
        //First Element
        if(size==0)
        {
            front=0;
            rear=0;
        }
        else
        {
            rear=(rear+1)%data.length;
        }
        data[rear]=ele;
        size++;
    }

    //Delete front
    public int deleteFront()
    {
        if(size==0)
        {
            return -1;
        }
        int temp=data[front];
        //when front==rear
        if(size==1)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front=(front+1)%data.length;
        }
        size--;
        return temp;
    }

    //Delete rear
    public int  deleteRear()
    {
        if(size==0)
        {
            return -1;
        }
        int temp=data[rear];
        //when front==rear
        if(size==1)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            rear=(rear-1+data.length)%data.length;
        }
        size--;
        return temp;
    }


    //Get front element
    public int getFront()
    {
        if(size==0)
        {
            return -1;
        }
        return data[front];
    }


    //Get rear element
    public int getRear()
    {
        if(size==0)
        {
            return -1;
        }
        return data[rear];
    }
}

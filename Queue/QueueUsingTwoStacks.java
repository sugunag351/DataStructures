package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks
{
    public static void main(String[] args) throws QueueEmptyException
    {
        Queue queue=new Queue();
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
//Queue using two stacks is implemented by using one stack for insertion and another stack for deletion.
// Reversing elements between stacks helps achieve FIFO behavior.
class Queue
{
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public Queue()
    {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    //Time complexity,O(1)
    public int getSize()
    {
        return stack1.size()+stack2.size();
    }
    //Time complexity,O(1)
    public boolean isEmpty()
    {
        return getSize()==0;
    }
    //Time complexity,O(1)
    public void enqueue(int ele)
    {
        stack1.push(ele);
    }
    //Time complexity,Amortized O(1) beacause elements are transfered between stacks only once
    public int dequeue() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException();
        }
        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    //Time complexity,Amortized O(1) because elements are transferred between stacks only once
    public int getFront() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException();
        }
        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}

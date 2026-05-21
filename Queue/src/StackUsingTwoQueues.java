import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;


public class StackUsingTwoQueues
{
    public static void main(String[] args) throws EmptyStackException
    {

        Stack stack=new Stack();
        int arr[]={4,6,5,1,2};
        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println("top element of the stack:"+stack.peek());
        System.out.println("size of the stack:"+stack.size());
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }
}
class Stack
{
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public Stack()
    {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    //Time Complexity O(1)
    public int size()
    {
        return queue1.size();
    }
    //Time Complexity O(1)
    public boolean isEmpty()
    {
        return size()==0;
    }
    //Time Complexity O(1)
    public void push(int ele)
    {
        queue1.add(ele);
    }
    //Time Complexity O(n)
    public int pop() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        while(queue1.size()>1)
        {
            queue2.add(queue1.poll());
        }
        int temp=queue1.poll();
        while (!queue2.isEmpty())
        {
            queue1.add(queue2.poll());
        }
        return temp;
    }
    //Time Complexity O(n)
    public int peek() throws EmptyStackException
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        while(queue1.size()>1)
        {
            queue2.add(queue1.poll());
        }
        int temp=queue1.peek();
        queue2.add(queue1.poll());
        while (!queue2.isEmpty())
        {
            queue1.add(queue2.poll());
        }
        return temp;
    }
}

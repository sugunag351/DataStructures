package Queue;

import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelementsInTheQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> input=new LinkedList<>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            input.add(arr[i]);
        }
        Queue<Integer> ans=reverseFirstKelements(input,3);
        System.out.println(ans);
        for(int x:ans)
        {
            System.out.print(x+" ");
        }
    }
    public static Queue<Integer> reverseFirstKelements(Queue<Integer> queue,int k)
    {
        if(queue.isEmpty() || k<=0 || k>queue.size())
        {
            return queue;
        }
        int n=queue.size();

        //Remove first k elements from the queue and store them in the stack
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++)
        {
            stack.push(queue.poll());
        }

        //Add all elements in the stack to the queue back
        while (!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        //remove first remaining(n-k) elements from the queue and add them into the queue
        for(int i=0;i<n-k;i++)
        {
            queue.add(queue.poll());
        }
        return queue;
    }
}

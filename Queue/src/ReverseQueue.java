import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> input=new LinkedList<>();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            input.add(arr[i]);
        }
        reverseQueue(input);
        System.out.println(input);
        for(int x:input)
        {
            System.out.print(x+" ");
        }
    }
    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
       if(input.size()<=1)
       {
           return;
       }
       int temp=input.poll();
       reverseQueue(input);
       input.add(temp);
    }
}

package Stack;

import java.util.*;
import java.util.Stack;

public class ReverseStack
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Stack<Integer> input=new Stack<>();
        int n=s.nextInt();
        for (int i=0;i<n;i++)
        {
            int value=s.nextInt();
            input.push(value);
        }
        Stack<Integer> extra=new Stack<>();
        reverseStack(input,extra);

        while (!input.isEmpty())
        {
            System.out.print(input.pop()+" ");
        }
    }
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {

        if(input.isEmpty())
        {
            return;
        }
        int temp=input.pop();

        reverseStack(input, extra);

        while(!input.isEmpty())
        {
            int value=input.pop();
            extra.push(value);
        }
        input.push(temp);
        while(!extra.isEmpty())
        {
            int value=extra.pop();
            input.push(value);
        }

    }
}

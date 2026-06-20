package Stack;

import java.util.Stack;
public class StackSpan
{
    public static void main(String[] args)
    {
        int[] price={60,70,80,100,90,75,80,120};
        int ans[]=stockSpan(price);
        for(int x:ans)
        {
            System.out.print(x+" ");
        }
    }
    public static int[] stockSpan(int[] price) {
        //Your code goes here
		/*
		   //Time Complexity O(n2)
		int output[]=new int[price.length];
		output[0]=1;
		for(int i=1;i<price.length;i++)
		{
			int span=1;
			for(int j=i-1;j>=0;j--)
			{
				if(price[j]<price[i])
				{
                    span++;
				}
				else
				{
					break;
				}
			}
			output[i]=span;
			span=1;
		}
		return output;
		*/


        //Time Complexity O(n)

        int output[]=new int[price.length];

        Stack<Integer> stack=new Stack<>();

        output[0]=1;
        stack.push(0);
        
        for(int i=1;i<price.length;i++)
        {
            while(!stack.isEmpty() && price[stack.peek()] < price[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                output[i]=i+1;
            }
            else
            {
                output[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return output;
    }
}

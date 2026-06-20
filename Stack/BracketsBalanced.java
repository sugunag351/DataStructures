package Stack;

import java.util.Stack;
public class BracketsBalanced
{
    public static void main(String[] args)
    {
        String str="({[()]}";
        System.out.println(isBalanced(str));
    }
    /*
          1.push opening brackets into the stack
          2.when the closing bracket encouters
            .check the stack is empty or not,if it is empty then retyrn false
            .if it is not empty,then compare the top element with the current closing bracket
          3.At last,check the stack is empty or not,if it is empty return true,otherwise return false. .
     */
    public static boolean isBalanced(String expression)
    {
        //Your code goes here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            char ch1=expression.charAt(i);
            if(ch1== '(' ||  ch1== '{' || ch1== '[' )
            {
                stack.push(expression.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char ch2=stack.pop();
                if(ch1== ')' && ch2!= '(')
                {
                     return false;
                }
                else if(ch1== '}' && ch2!='{')
                {
                    return false;
                }
                else if(ch1== ']' && ch2!='[')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

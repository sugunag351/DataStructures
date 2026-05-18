import java.util.Stack;
public class MinimumBracketReversal
{
    public static void main(String[] args)
    {
        String input="{{{}}{";
        System.out.println(countBracketReversals(input));
    }
    public static int countBracketReversals(String input) {

        //Time Complexity O(n)
        //Space Complexity is O(n)  because of stack
        /*
              1.if string length is odd then return -1
              2.if string length is even then check
              3.if we encounter a '{' push into the stack
              4.if we encoutner a '}' ,then if the stack is empty
                  or top of the stack is also '}' then push that
                  '}' into the stack
              5.if we encounter a '}' and the top of the stack is '{'
                then pop that '{' that means both are balanced
              6.At last if the stack is empty that means all are balanced,return 0;
              7.otherwise,pop out of the last two brackets ,if both are equeal
                then increment count by 1
              8.if both are not equal then increment the coutn by 2.
         */
        if(input.length()%2==1)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{')
            {
                stack.push('{');
            }
            else
            {
                if(stack.isEmpty())
                {
                    stack.push('}');
                }
                else
                {
                    if(stack.peek()=='{')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push('}');
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return 0;
        }
        else
        {
            while(!stack.isEmpty())
            {
                char a=stack.pop();
                char b=stack.pop();
                if(a==b)
                {
                    count+=1;
                }
                else
                {
                    count+=2;
                }
            }
        }
        return count;
    }
}

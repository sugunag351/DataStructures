import java.util.Stack;
import java.util.*;
public class CheckRedundantBrackets
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(checkRedundantBrackets(str));
    }
    public static boolean checkRedundantBrackets(String expression)
    {
        Stack<Character> input=new Stack<>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)!=')')
            {
                input.push(expression.charAt(i));
            }
            else
            {
                if(input.isEmpty())
                {
                    return false;
                }
                char ch=input.pop();
                while(ch!='(')
                {
                    count++;
                    if(input.isEmpty())
                    {
                        return false;
                    }
                    ch=input.pop();
                }
                if(count==0 || count==1)
                {
                    return true;
                }
                count=0;
            }
        }
        return false;
    }
}

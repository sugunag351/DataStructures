public class StackUse
{
    public static void main(String[] args) throws StackEmptyException
    {
        StackUsingArray stack=new StackUsingArray(5);
        int arr[]={4,6,5,1,2};
        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        System.out.println("top element of the stack:"+stack.top());
        System.out.println("size of the stack:"+stack.size());
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
class StackUsingArray
{
    private int data[];
    private int topIndex;
    public StackUsingArray()
    {
       data=new int[10];
       topIndex=-1;
    }
    public StackUsingArray(int size)
    {
        data=new int[size];
        topIndex=-1;
    }
    //insert element into stack at the top of the stack,O(1)
    public void push(int ele)
    {
        if(topIndex==data.length-1)
        {
            doubleCapacity(data);
        }
        topIndex++;
        data[topIndex]=ele;
    }
    //Double the capacity of the stack when the stack is full,O(n)
    private void doubleCapacity(int[] data)
    {
        int temp[]=data;
        data=new int[data.length*2];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=data[i];
        }
    }
    //Return the top most element of the stack,O(1)
    public int top()  throws StackEmptyException
    {
       if(topIndex==-1)
       {
          throw new StackEmptyException();
       }
       return data[topIndex];
    }
    //Remove the top most element of the stack and return the removed element,O(1)
    //If stack is empty then throw stackEmptyException
    public int pop()
    {
        if(topIndex==-1)
        {
            return -1;
        }
        int temp=data[topIndex];
        data[topIndex]=0;
        topIndex--;
        return temp;
    }
    //Return the size of the stack,O(1)
    public int size()
    {
       return topIndex+1;
    }
    //Check whether the stack is empty or not,O(1)
    public boolean isEmpty()
    {
        if(topIndex==-1)
        {
            return true;
        }
        return false;
    }
}

class StackEmptyException extends Exception
{

}

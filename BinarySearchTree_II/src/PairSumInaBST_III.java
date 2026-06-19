import java.util.*;
public class PairSumInaBST_III
{
    //O(h)=O(logn) => (h=height of tree) ,(n=number of nodes in BST)
/*
        | Approach               | Balanced BST Time | Balanced BST Space | Skewed BST Time | Skewed BST Space |
        | ---------------------- | ----------------- | ------------------ | --------------- | ---------------- |
        | Two Iterators + Stacks | O(n)              | O(log n)           | O(n)            | O(n)             |
*/
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printNodesSumToS(root,12);
    }

    /*
    Algorithm:

    1.Create two stacks:
          =>leftStack for inorder traversal (smallest → largest).
          =>rightStack for reverse inorder traversal (largest → smallest).
    2.Push the leftmost path of the BST into leftStack.
    3.Push the rightmost path of the BST into rightStack.
    4.Get:
           =>left = top (next smallest) element from leftStack.
           =>right = top (next largest) element from rightStack.
    5.While left < right:
           =>Calculate sum = left + right.
                   If sum == S:
                        Print left right.
                        Move both iterators:
                             ->Get next smallest element.
                             ->Get next largest element.
                   Else if sum < S:
                         Move the inorder iterator to get a larger value.
                   Else (sum > S):
                          Move the reverse inorder iterator to get a smaller value.
    6.Stop when left >= right.
 */
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        if(root==null)
        {
            return;
        }

        Stack<BinaryTreeNode<Integer>> leftStack=new Stack<>();
        Stack<BinaryTreeNode<Integer>> rightStack=new Stack<>();

        BinaryTreeNode<Integer> curr=root;

        while(curr!=null)
        {
            leftStack.push(curr);
            curr=curr.left;
        }

        curr=root;
        while(curr!=null)
        {
            rightStack.push(curr);
            curr=curr.right;
        }

        int left=getNext(leftStack);
        int right=getPrev(rightStack);

        while(left<right)
        {
            int sum=left+right;

            if(sum<s)
            {
                left=getNext(leftStack);
            }
            else if(sum>s)
            {
                right=getPrev(rightStack);
            }
            else
            {
                System.out.println(left+" "+right);
                left=getNext(leftStack);
                right=getPrev(rightStack);
            }
        }
    }

    /*
    Helper: Get Next Smallest
    1.Pop the top node from leftStack.
    2.Store its value.
    3.Move to its right child.
    4.Push the leftmost path of that right subtree into leftStack.
    5.Return the stored value.
     */

    private static int getNext(Stack<BinaryTreeNode<Integer>> leftStack)
    {
        BinaryTreeNode<Integer> node=leftStack.pop();
        int value=node.data;

        node=node.right;
        while(node!=null)
        {
            leftStack.push(node);
            node=node.left;
        }
        return value;
    }
    /*
    Helper: Get Next Largest
    1.Pop the top node from rightStack.
    2.Store its value.
    3.Move to its left child.
    4.Push the rightmost path of that left subtree into rightStack.
    5.Return the stored value.
     */
    private static int getPrev(Stack<BinaryTreeNode<Integer>> rightStack)
    {
        BinaryTreeNode<Integer> node=rightStack.pop();
        int value=node.data;

        node=node.left;
        while(node!=null)
        {
            rightStack.push(node);
            node=node.right;
        }
        return value;
    }
}

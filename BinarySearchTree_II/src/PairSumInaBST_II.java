import java.util.*;
public class PairSumInaBST_II
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printNodesSumToS(root,3);
    }
    //O(h)=O(logn) => (h=height of tree) ,(n=number of nodes in BST)
    /*
        | Approach               | Balanced BST Time | Balanced BST Space | Skewed BST Time | Skewed BST Space |
        | ---------------------- | ----------------- | ------------------ | --------------- | ---------------- |
        | Inorder + ArrayList    | O(n)              | O(n)               | O(n)            | O(n)             |

     */

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

        ArrayList<Integer> arr=new ArrayList<>();
        helper(root,arr);
        int i=0,j=arr.size()-1;
        while(i<j)
        {
            int sum=arr.get(i)+arr.get(j);
            if(sum<s)
            {
                i++;
            }
            else if(sum>s)
            {
                j--;
            }
            else
            {
                System.out.println(arr.get(i)+" "+arr.get(j));
                i++;
                j--;
            }
        }

    }
    private static void helper(BinaryTreeNode<Integer> root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,arr);
        arr.add(root.data);
        helper(root.right,arr);
    }
}

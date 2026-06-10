class BinaryTreeReturn
{
    int height;
    boolean isBalanced;
}
public class CheckBalanced_Improved
{
    public static void main(String[] args)
    {
       BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
       System.out.println(isBalancedBetter(root).isBalanced);
    }
    //A binary tree is balanced if ( |leftHeight - rightHeight| <= 1 ) for every node.
    //Time complexity O(n)
    public static BinaryTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            BinaryTreeReturn ans=new BinaryTreeReturn();
            ans.height=0;
            ans.isBalanced=true;
            return ans;
        }

        BinaryTreeReturn leftOutput=isBalancedBetter(root.left);
        BinaryTreeReturn rightOutput=isBalancedBetter(root.right);

        boolean isBal=true;
        int height= 1 + Math.max(leftOutput.height , rightOutput.height);

        if(Math.abs(leftOutput.height- rightOutput.height)>1)
        {
            isBal=false;
        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced)
        {
            isBal=false;
        }

        BinaryTreeReturn ans=new BinaryTreeReturn();
        ans.height=height;
        ans.isBalanced=isBal;
        return ans;
    }
}

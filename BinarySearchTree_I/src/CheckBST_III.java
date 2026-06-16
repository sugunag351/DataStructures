public class CheckBST_III
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println(isBST(root));
    }
    //Time Complexity O(n)
    public static boolean isBST(BinaryTreeNode<Integer> root)
    {
        return isBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static boolean isBST3(BinaryTreeNode<Integer> root,int minRange,int maxRange)
    {
        if(root==null)
        {
            return true;
        }

        if(root.data<minRange || root.data>maxRange)
        {
            return false;
        }

        boolean isLeftWithinRange=isBST3(root.left,minRange,root.data-1);
        boolean isRightWithinRange=isBST3(root.right, root.data, maxRange);

        return isLeftWithinRange && isRightWithinRange;

    }
}

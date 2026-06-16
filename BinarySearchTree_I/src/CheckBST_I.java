public class CheckBST_I
{
    public static void main(String[] args)
    {
         BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
         System.out.println(isBST(root));
    }
    //For BST left<root && right>=root
    //Time Complexity O(n2)
    public static boolean isBST(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return true;
        }

        int leftMax=max(root.left);
        if(leftMax>=root.data)
        {
            return false;
        }
        int rightMin=min(root.right);
        if(rightMin<root.data)
        {
            return false;
        }

        boolean isLeftBST=isBST(root.left);
        boolean isRightBST=isBST(root.right);
        return isLeftBST && isRightBST;

    }

    public static int max(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int leftMax=max(root.left);
        int rightMax=max(root.right);

        return Math.max(root.data,Math.max(leftMax,rightMax));
    }

    public static int min(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int leftMin=min(root.left);
        int rightMin=min(root.right);

        return Math.min(root.data,Math.min(leftMin,rightMin));
    }

}

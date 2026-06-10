public class IsNodePresent
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println(isNodePresent(root,2));
    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {

        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        boolean leftSide=isNodePresent(root.left,x);
        if(leftSide)
        {
            return true;
        }
        else
        {
            return isNodePresent(root.right,x);
        }

    }

     /*
    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
    }

      */
}

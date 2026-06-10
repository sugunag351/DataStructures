public class InOrderTraversal
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        inOrder(root);
    }
    public static void inOrder(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}

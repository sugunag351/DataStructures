package GenericTrees;

public class PostOrderTraversal
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        printPostOrder(root);
    }
    public static void printPostOrder(TreeNode<Integer> root)
    {

        if(root==null)
        {
            return;
        }

        for(int i=0;i<root.children.size();i++)
        {
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }
}

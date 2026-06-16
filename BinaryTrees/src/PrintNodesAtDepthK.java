public class PrintNodesAtDepthK
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        printAtDepthK(root,2);
    }
    //Depth of a node means, distance from its root
    //Depth of a root node is 0
    public static void printAtDepthK(BinaryTreeNode<Integer> root,int k)
    {
        if(root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(root.data+" ");
            return;
        }
        printAtDepthK(root.left,k-1);
        printAtDepthK(root.right,k-1);
    }
}


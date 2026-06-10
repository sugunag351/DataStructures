public class LargestNode
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println("Largest node in a tree is:"+largestNode(root));
    }
    public static int largestNode(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return -1;
        }
        int largestLeft=largestNode(root.left);
        int largestRight=largestNode(root.right);
        return Math.max(root.data,Math.max(largestLeft,largestRight));
    }
}

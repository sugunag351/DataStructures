package BinaryTrees;

public class NodesGreaterThanX
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        int x=2;
        System.out.println("Nodes greater than "+x+" is: "+countNodesGreaterThanX(root,x));
    }
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {

        if(root==null)
        {
            return 0;
        }
        int leftCount = countNodesGreaterThanX(root.left,x);
        int rightCount = countNodesGreaterThanX(root.right,x);
        if(root.data>x)
        {
            return leftCount+rightCount+1;
        }
        return leftCount+rightCount;
    }
}

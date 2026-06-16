public class CreateAndInsertDuplicateNode
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        insertDuplicateNode(root);
        BinaryTreeUse.printLevelWise(root);
    }
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return;
        }
        BinaryTreeNode<Integer> duplicate=new BinaryTreeNode<>(root.data);

        BinaryTreeNode<Integer> temp=root.left;
        root.left=duplicate;
        duplicate.left=temp;

        insertDuplicateNode(temp);
        insertDuplicateNode(root.right);
    }
}

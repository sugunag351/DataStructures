package GenericTrees;

public class RemoveLeafNoesInaTree
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        root=removeLeafNodes(root);
        GenericTreeUse.printLevelWise(root);
    }
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root)
    {

		/*
	1. If the current node is null, return null; if it is a leaf node, return null.
    2.Recursively process all children from the last index to the first index.
    3.If a recursive call returns null, remove that child from the children list.
    4.Return the current node after removing all leaf children.
    5.This removes all leaf nodes in a single traversal of the tree.
      */
        if(root==null)
        {
            return null;
        }
        if(root.children.size()==0)
        {
            return null;
        }
        for(int i=root.children.size()-1;i>=0;i--)
        {
            TreeNode<Integer> childAns=removeLeafNodes(root.children.get(i));
            if(childAns==null)
            {
                root.children.remove(i);
            }
        }
        return root;
    }
}

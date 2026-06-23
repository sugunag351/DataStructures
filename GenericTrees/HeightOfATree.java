package GenericTrees;

public class HeightOfATree
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(getHeight(root));
    }
    /*
    For each node:

    1.Find the height of all its children.
    2.Take the maximum child height.
    3.Add 1 for the current node.

     */
    public static int getHeight(TreeNode<Integer> root)
    {

        if(root==null)
        {
            return 0;
        }
        int height=0;
        for(int i=0;i<root.children.size();i++)
        {
            int childHeight=getHeight(root.children.get(i));
            height=Math.max(height,childHeight);
        }
        return 1+height;
    }
}

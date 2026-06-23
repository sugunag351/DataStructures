package GenericTrees;

public class NextLargerElement
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        TreeNode<Integer> nextLargest=findNextLargerNode(root,18);
        System.out.println(nextLargest.data);
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n)
    {
        if(root==null)
        {
            return null;
        }

        TreeNode<Integer> largest=null;
        if(root.data>n)
        {
            largest=root;
        }
        for(int i=0;i<root.children.size();i++)
        {
            TreeNode<Integer> childLargest=findNextLargerNode(root.children.get(i),n);
            if(childLargest!=null)
            {
                if(largest==null || childLargest.data<largest.data)
                {
                    largest=childLargest;
                }
            }
        }
        return largest;
    }
}

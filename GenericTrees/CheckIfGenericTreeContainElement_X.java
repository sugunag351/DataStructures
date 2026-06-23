package GenericTrees;

public class CheckIfGenericTreeContainElement_X
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(checkIfContainsX(root,70));
    }
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x)
    {
        if(root==null)
        {
            return false;
        }

        if(root.data==x)
        {
            return true;
        }
        for(int i=0;i<root.children.size();i++)
        {
            boolean childAns=checkIfContainsX(root.children.get(i),x);
            if(childAns)
            {
                return true;
            }
        }
        return false;
    }
}

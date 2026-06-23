package GenericTrees;

public class StructurallyIdenticalOrNot
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root1=GenericTreeUse.takeInputLevelWise();
        TreeNode<Integer> root2=GenericTreeUse.takeInputLevelWise();
        System.out.println(checkIdentical(root1,root2));
    }
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
    {

        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        if(root1.children.size()!=root2.children.size())
        {
            return false;
        }
        if(root1.data!=root2.data)
        {
            return false;
        }
        for(int i=0;i<root1.children.size();i++)
        {
            boolean childAns=checkIdentical(root1.children.get(i),root2.children.get(i));
            if(!childAns)
            {
                return false;
            }
        }
        return true;
    }
}

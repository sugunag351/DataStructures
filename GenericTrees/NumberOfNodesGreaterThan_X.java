package GenericTrees;

public class NumberOfNodesGreaterThan_X
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(numNodeGreater(root,35));
    }
    public static int numNodeGreater(TreeNode<Integer> root,int x){


        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.data>x)
        {
            count+=1;
        }
        for(int i=0;i<root.children.size();i++)
        {
            TreeNode<Integer> child=root.children.get(i);
            int childCount=numNodeGreater(child,x);
            count+=childCount;
        }
        return count;
    }
}

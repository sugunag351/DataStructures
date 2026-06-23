package GenericTrees;


public class NumberOfNodesInaGenericTree
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(numberOfNodes(root));
    }


    public static int numberOfNodes(TreeNode<Integer> root)
    {
        //It is a special case, not the base case
        if(root==null)
        {
            return 0;
        }

        int count=1;
        //Base case is size of arrayList when size==0
        for(int i=0;i<root.children.size();i++)
        {
            int childCount=numberOfNodes(root.children.get(i));
            count+=childCount;
        }
        return count;
    }
}

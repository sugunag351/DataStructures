package GenericTrees;
class ReturnValue
{
    TreeNode<Integer> node;
    int largestSum;
    public ReturnValue(TreeNode<Integer> node, int largestSum)
    {
        this.node=node;
        this.largestSum=largestSum;
    }
}


public class NodeHavingMaxSum
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(maxSumNode(root).data);
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){

        if(root==null)
        {
            return null;
        }
        ReturnValue ans=helper(root);
        return ans.node;
    }


    public static ReturnValue helper(TreeNode<Integer> root)
    {
        TreeNode<Integer> node=root;
        int largestSum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
            largestSum+=root.children.get(i).data;
        }
        ReturnValue currentAns=new ReturnValue(node,largestSum);

        for(int i=0;i<root.children.size();i++)
        {
            ReturnValue childAns=helper(root.children.get(i));
            if(childAns.largestSum > currentAns.largestSum)
            {
                currentAns=childAns;
            }
        }
        return currentAns;
    }

}

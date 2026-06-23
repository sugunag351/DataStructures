package GenericTrees;
class Pair
{
    TreeNode<Integer> largest;
    TreeNode<Integer> second;
    public Pair(TreeNode<Integer> largest, TreeNode<Integer> second)
    {
        this.largest=largest;
        this.second=second;
    }
}
public class SecondLargestElement
{
    public static void main(String[] args)
    {
        TreeNode<Integer> root=GenericTreeUse.takeInputLevelWise();
        System.out.println(findSecondLargest(root).data);
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return null;
        }

        Pair ans=helper(root);
        return ans.second;
    }


    public static Pair helper(TreeNode<Integer> root)
    {
        Pair ans=new Pair(root,null);
        for(int i=0;i<root.children.size();i++)
        {
            Pair childAns=helper(root.children.get(i));
            ans=merge(ans,childAns);
        }
        return ans;
    }




    public static Pair merge(Pair ans, Pair childAns)
    {
        TreeNode<Integer> largest=ans.largest;
        TreeNode<Integer> second=ans.second;

        TreeNode<Integer> childLargest=childAns.largest;
        TreeNode<Integer> childSecond=childAns.second;

        if(childLargest.data > largest.data)
        {
            second=getLargest(second,largest);
            largest=childLargest;
            second=getLargest(second,childSecond);
        }
        else if(childLargest.data<largest.data)
        {
            second=getLargest(second,childLargest);
            second=getLargest(second,childSecond);
        }
        else
        {
            second=getLargest(second,childSecond);
        }
        return new Pair(largest,second);
    }



    public static TreeNode<Integer> getLargest(TreeNode<Integer> a,TreeNode<Integer> b)
    {
        if(a==null)
        {
            return b;
        }
        if(b==null)
        {
            return a;
        }
        return a.data>b.data ? a : b;
    }
}

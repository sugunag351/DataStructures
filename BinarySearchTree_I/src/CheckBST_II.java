class BSTReturn
{
    int max;
    int min;
    boolean isBST;
    public BSTReturn(int max,int min,boolean isBST)
    {
        this.max=max;
        this.min=min;
        this.isBST=isBST;
    }
}



public class CheckBST_II
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        System.out.println(isBST(root));
    }
    //Time complexity O(n)
    public static boolean isBST(BinaryTreeNode<Integer> root) {

        BSTReturn ans=isBST2(root);
        return ans.isBST;
    }


    public static BSTReturn isBST2(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            BSTReturn ans=new BSTReturn(Integer.MIN_VALUE,Integer.MAX_VALUE,true);
            return ans;
        }

        BSTReturn leftOutput=isBST2(root.left);
        BSTReturn rightOutput=isBST2(root.right);

        boolean isBST=true;
        if(leftOutput.max>=root.data || rightOutput.min<root.data)
        {
            isBST=false;
        }
        if(!leftOutput.isBST  ||  !rightOutput.isBST)
        {
            isBST=false;
        }

        int max=Math.max(root.data,Math.max(leftOutput.max,rightOutput.max));
        int min=Math.min(root.data,Math.min(leftOutput.min,rightOutput.min));

        BSTReturn ans=new BSTReturn(max,min,isBST);
        return ans;
    }
}

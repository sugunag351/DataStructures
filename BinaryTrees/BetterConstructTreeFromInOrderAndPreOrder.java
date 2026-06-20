package BinaryTrees;

public class BetterConstructTreeFromInOrderAndPreOrder
{
    public static void main(String[] args)
    {
        int preOrder[]={1,2,3,4};
        int inOrder[]={2,1,4,3};
        BinaryTreeNode<Integer> root=buildTree(preOrder,inOrder);
        BinaryTreeUse.printLevelWise(root);
    }
    //Time Complexity O(n2)
    //Space Complexity O(n)
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        return buildTreeBetter(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
    }
    public static BinaryTreeNode<Integer> buildTreeBetter(int[] preOrder, int[] inOrder, int siPre, int eiPre, int siIn, int eiIn)
    {
        if(siPre>eiPre)
        {
            return null;
        }
        int rootData=preOrder[siPre];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++)
        {
            if(inOrder[i]==rootData)
            {
                rootIndex=i;
                break;
            }
        }

        int siPreLeft=siPre+1;


        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;


        int eiPreRight=eiPre;

        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        int leftSubtreeLength=eiInLeft-siInLeft+1;

        int eiPreLeft=siPreLeft+leftSubtreeLength-1;
        int siPreRight=eiPreLeft+1;

        BinaryTreeNode<Integer> leftOutput=buildTreeBetter(preOrder,inOrder,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> rightOutput=buildTreeBetter(preOrder,inOrder,siPreRight,eiPreRight,siInRight,eiInRight);

        root.left=leftOutput;
        root.right=rightOutput;

        return root;
    }
}

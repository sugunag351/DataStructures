package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class ConstructTreeFromPostOrderAndInOrder
{
    public static void main(String[] args)
    {
        int postOrder[]={2,4,3,1};
        int inOrder[]={2,1,4,3};
        BinaryTreeNode<Integer> root=buildTree(postOrder,inOrder);
        BinaryTreeUse.printLevelWise(root);
    }
    //Time Complexity O(n2)
    //Space Complexity O(n)
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        return buildTreeBetter(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
    }
    public static BinaryTreeNode<Integer> buildTreeBetter(int[] postOrder,int[] inOrder,int siPost,int eiPost,int siIn,int eiIn)
    {
        if(siPost>eiPost)
        {
            return null;
        }
        int rootData=postOrder[eiPost];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootIndex=0;
        for(int i=siIn;i<=eiIn;i++)
        {
            if(inOrder[i]==rootData)
            {
                rootIndex=i;
                break;
            }
        }

        int siPostLeft=siPost;


        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;


        int eiPostRight=eiPost-1;

        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        int leftSubtreeLength=eiInLeft-siInLeft+1;
        int eiPostLeft=siPost+leftSubtreeLength-1;
        int siPostRight=eiPostLeft+1;

        BinaryTreeNode<Integer> leftOutput=buildTreeBetter(postOrder,inOrder,siPostLeft,eiPostLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> rightOutput=buildTreeBetter(postOrder,inOrder,siPostRight,eiPostRight,siInRight,eiInRight);

        root.left=leftOutput;
        root.right=rightOutput;

        return root;

    }
}

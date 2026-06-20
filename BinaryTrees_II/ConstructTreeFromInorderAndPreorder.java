package BinaryTrees_II;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class ConstructTreeFromInorderAndPreorder
{
    public static void main(String[] args)
    {
        int preOrder[]={1,2,3,4};
        int inOrder[]={2,1,4,3};
        BinaryTreeNode<Integer> root=buildTree(preOrder,inOrder);
        BinaryTreeUse.printLevelWise(root);
    }
    //Time complexity O(n2)
    //Space Complexity O(n2)
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        if(preOrder.length ==0 && inOrder.length==0)
        {
            return null;
        }
        int rootData=preOrder[0];
        int inOrderRootIndex=0;
        for(int i=0;i<inOrder.length;i++)
        {
            if(inOrder[i]==rootData)
            {
                inOrderRootIndex=i;
            }
        }
        int leftLength=inOrderRootIndex;
        int leftInOrder[]=new int[leftLength];
        for(int i=0;i<leftLength;i++)
        {
            leftInOrder[i]=inOrder[i];
        }

        int leftPreOrder[]=new int[leftLength];
        int index=0;
        for(int i=1;i<leftLength+1;i++)
        {
            leftPreOrder[index++]=preOrder[i];
        }

        int rightLength=inOrder.length-(leftLength+1);
        int rightInOrder[]=new int[rightLength];
        int rightPreOrder[]=new int[rightLength];
        index=0;
        for(int i=leftLength+1;i<inOrder.length;i++)
        {
            rightInOrder[index]=inOrder[i];
            rightPreOrder[index]=preOrder[i];
            index++;
        }


        BinaryTreeNode<Integer> root=new BinaryTreeNode(rootData);
        BinaryTreeNode<Integer> leftNode=buildTree(leftPreOrder,leftInOrder);
        BinaryTreeNode<Integer> rightNode=buildTree(rightPreOrder,rightInOrder);

        root.left=leftNode;
        root.right=rightNode;

        return root;
    }
}

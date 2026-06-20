package BinarySearchTree_II;

import BinaryTrees.BinaryTreeNode;

public class BSTUse
{
     public static void main(String[] args)
     {
         BST b=new BST();
         b.insert(5);
         b.insert(2);
         b.insert(3);
         b.insert(2);
         b.insert(6);
         b.insert(1);

         b.printTree();
         System.out.println(b.getSize());

         System.out.println(b.isPresent(3));
         System.out.println(b.deleteData(3));
         System.out.println(b.isPresent(3));
         b.printTree();

         System.out.println(b.getSize());

     }
}
     // if it is a balanced tree
    //Time complexity of all operations O(logN)=O(h) => (h=height of tree)
    //otherwise O(N) if it is a skewed tree

class BST
{
    private BinaryTreeNode<Integer> root;
    private int size;

    //1.Searching a node in BST
    public boolean isPresent(int x)
    {
        return isPresentHelper(root,x);
    }
    private static boolean isPresentHelper(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
        {
            return false;
        }
        if(x==root.data)
        {
            return true;
        }

        if(x<root.data)
        {
            //call on left side
            return isPresentHelper(root.left,x);
        }
        else
        {
            //call on right side
            return isPresentHelper(root.right,x);
        }
    }



    //2.Inserting a node in BST
    public void insert(int x)
    {
        root=insert(root,x);
        size++;
    }
    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
        {
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<>(x);
            return newRoot;
        }

        if(x<root.data)
        {
            root.left=insert(root.left,x);
        }
        else
        {
            root.right=insert(root.right,x);
        }
        return root;
    }



    //3.Delete a node in BST
    public boolean deleteData(int x)
    {
        BSTDeleteReturn output=deleteData(root,x);
        root=output.root;
        if(output.deleted)
        {
            size--;
        }
        return output.deleted;
    }
    private static int minimum(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }

        int leftOutput=minimum(root.left);
        int rightOutput=minimum(root.right);

        return Math.min(root.data,Math.min(leftOutput,rightOutput));
    }
    private static BSTDeleteReturn deleteData(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
        {
            return new BSTDeleteReturn(null,false);
        }

        if(x<root.data)
        {
            BSTDeleteReturn leftOutput=deleteData(root.left,x);
            root.left=leftOutput.root;
            leftOutput.root=root;
            return leftOutput;
        }

        else if(x>root.data)
        {
            BSTDeleteReturn rightOutput=deleteData(root.right,x);
            root.right=rightOutput.root;
            rightOutput.root=root;
            return rightOutput;
        }
        else
        {
            //if(x==root.data)
            //1.No children
            if (root.left == null && root.right == null) {
                return new BSTDeleteReturn(null, true);
            }
            //2.Only have right child
            else if (root.left == null && root.right != null) {
                return new BSTDeleteReturn(root.right, true);
            }
            //3.Only have left child
            else if (root.left != null && root.right == null) {
                return new BSTDeleteReturn(root.left, true);
            }
            //4.have both left and right child ,if(root.left!=null && root.right!=null)
            else {
                int rightMin = minimum(root.right);
                root.data = rightMin;
                BSTDeleteReturn outputRight = deleteData(root.right, rightMin);
                root.right = outputRight.root;
                return new BSTDeleteReturn(root, true);
            }
        }

    }



    //4.size of a BST(number of nodes in BST)
    public int getSize()
    {
        return size;
    }


    //5.Print BST
    public void printTree()
    {
        printTreeHelper(root);
    }
    private static void printTreeHelper(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }

        System.out.print(root.data+":");
        if(root.left!=null)
        {
            System.out.print("L:"+root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print("R:"+root.right.data);
        }
        System.out.println();

        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }

}


class BSTDeleteReturn
{
    BinaryTreeNode<Integer> root;
    boolean deleted;
    BSTDeleteReturn(BinaryTreeNode<Integer> root,boolean deleted)
    {
        this.root=root;
        this.deleted=deleted;
    }
}

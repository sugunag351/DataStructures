
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class BinaryTreeNode<T>
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    public BinaryTreeNode(T data)
    {
        this.data=data;
    }
}





public class BinaryTreeUse
{
    public static void main(String[] args)
    {
        /*
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);

        BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<>(3);
        root.left=rootLeft;
        root.right=rootRight;
        printTreeDetailed(root);
         */

        /*
        BinaryTreeNode<Integer> root=takeTreeInput(true,0,true);
        printTreeDetailed(root);

        root=takeTreeInput(true);
        printTreeDetailed(root);

         */

        BinaryTreeNode<Integer> root=takeInputLevelWise();
        printLevelWise(root);
    }
    public static void printTree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static void printTreeDetailed(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null)
        {
            System.out.print("L"+root.left.data+",");
        }
        if(root.right!=null)
        {
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot)
    {

        if(isRoot)
        {
            System.out.println("Enter root data:");
        }
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        System.out.println("Enter left child of "+rootData);
        BinaryTreeNode<Integer> leftChild=takeTreeInput(false);

        System.out.println("Enter right child of "+rootData);
        BinaryTreeNode<Integer> rightChild=takeTreeInput(false);

        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot,int parentData,boolean isLeft)
    {
        if(isRoot)
        {
            System.out.println("Enter root data:");
        }
        else
        {
            if(isLeft)
            {
                System.out.println("Enter left child of "+parentData);
            }
            else
            {
                System.out.println("Enter right child of "+parentData);
            }
        }

        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild=takeTreeInput(false,rootData,true);
        BinaryTreeNode<Integer> rightChild=takeTreeInput(false,rootData,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise()
    {
         /*
      queue contains nodes which are waiting for its left and right child
          1.take root input from the user
          2.push root node into the queue
          3.continue the below process till the queue is not empty
                 .Remove front node from the queue
                 .Ask leftChild for this front element from the user
                    .If leftChild is not equal to -1
                    .then connect front element with this leftChild and push this leftChild into the queue
                 .Ask rightChild for this front element from the user
                    .If rightChild is not equal to -1
                    .then connect front element with this rightChild and push this rightChild into the queue
         4.when queue is empty return root
     */
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root Data:");
        int rootData=s.nextInt();
        if(rootData==-1)
        {
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            BinaryTreeNode<Integer> front=queue.poll();

            System.out.println("Enter left child of "+front.data);
            int left=s.nextInt();
            if(left!=-1)
            {
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(left);
                front.left=leftChild;
                queue.add(leftChild);
            }

            System.out.println("Enter right child of "+front.data);
            int right=s.nextInt();
            if(right!=-1)
            {
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(right);
                front.right=rightChild;
                queue.add(rightChild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        if(root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            BinaryTreeNode<Integer> front=queue.poll();
            int leftValue=-1;
            int rightValue=-1;

            if(front.left!=null)
            {
                leftValue=front.left.data;
                queue.add(front.left);
            }

            if(front.right!=null)
            {
                rightValue=front.right.data;
                queue.add(front.right);
            }

            System.out.println(front.data+":L:"+leftValue+",R:"+rightValue);
        }
    }
}


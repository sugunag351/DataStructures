package GenericTrees;

import java.util.*;

public class GenericTreeUse
{
    public static void main(String[] args)
    {
        /*
        TreeNode<Integer> root=new TreeNode<>(10);
        TreeNode<Integer> node1=new TreeNode<>(20);
        TreeNode<Integer> node2=new TreeNode<>(30);
        TreeNode<Integer> node3=new TreeNode<>(40);
        TreeNode<Integer> node4=new TreeNode<>(50);
        TreeNode<Integer> node5=new TreeNode<>(60);
        TreeNode<Integer> node6=new TreeNode<>(70);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node1.children.add(node4);
        node1.children.add(node5);

        node3.children.add(node6);
         */

       // printTree(root);

       TreeNode<Integer> root=takeInputLevelWise();
        printLevelWise(root);

    }

    //Take input level wise
    public static TreeNode<Integer> takeInputLevelWise()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root Data:");
        int rootData=sc.nextInt();
        if(rootData==-1)
        {
            return null;
        }

        TreeNode<Integer> root =new TreeNode<>(rootData);

        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode<Integer> front=queue.poll();
            System.out.println("Enter number of child nodes of "+front.data+":");
            int size=sc.nextInt();
            for (int i=0;i<size;i++)
            {
                System.out.println("Enter the "+(i+1)+" th child for "+front.data+":");
                int childData=sc.nextInt();
                TreeNode<Integer> child=new TreeNode<>(childData);
                front.children.add(child);

                queue.add(child);
            }
        }
        return root;
    }

    //Print Level wise
    public static void printLevelWise(TreeNode<Integer> root)
    {

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i = 0; i < size; i++)
            {
                TreeNode<Integer> front = queue.poll();
                System.out.print(front.data + " ");
                for (int j = 0; j < front.children.size(); j++)
                {
                    queue.add(front.children.get(j));
                }
            }
            System.out.println();
        }

    }


    //Take input Depth wise(recursively)
    public static TreeNode<Integer> takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data:");
        int rootData= sc.nextInt();

        TreeNode<Integer> root=new TreeNode<>(rootData);

        System.out.println("Enter number of child nodes of "+root.data+":");
        int size=sc.nextInt();

        for (int i=0;i<size;i++)
        {
            TreeNode<Integer> childNode=takeInput();
            root.children.add(childNode);
        }
        return root;
    }


    //Print Tree Depth wise
    public static void printTree(TreeNode<Integer> root)
    {
        //It is a special case ,not the base case
        if(root==null)
        {
            return;
        }

        System.out.print(root.data+" ");
        //Here the base case is size of ArrayList, when size==0
        for(int i=0;i<root.children.size();i++)
        {
            TreeNode<Integer> child=root.children.get(i);
            printTree(child);
        }
    }



    //Print Tree Depth Wise but followed by children
    public static void printTreeDetailed(TreeNode<Integer> root)
    {
        //It is a special case ,not the base case
        if(root==null)
        {
            return;
        }

        System.out.print(root.data+": ");
        for(int i=0;i<root.children.size();i++)
        {
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();


        //Here the base case is size of ArrayList, when size==0
        for(int i=0;i<root.children.size();i++)
        {
            TreeNode<Integer> child=root.children.get(i);
            printTreeDetailed(child);
        }
    }

}

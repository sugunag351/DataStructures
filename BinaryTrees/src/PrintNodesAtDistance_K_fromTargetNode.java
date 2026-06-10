public class PrintNodesAtDistance_K_fromTargetNode
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        nodesAtDistanceK(root,5,2);
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int k) {


        solve(root,target,k);

    }

    public static int solve(BinaryTreeNode<Integer> root,int target,int k)
    {
        if(root==null)
        {
            return -1;
        }


        //Target Node found
        if(root.data==target)
        {
            printDown(root,k);
            return 0;
        }

        int leftDistance=solve(root.left,target,k);

        if(leftDistance!=-1)
        {
            if(leftDistance+1==k)
            {
                System.out.println(root.data);
            }
            else
            {
                printDown(root.right,k-leftDistance-2);
            }
            return leftDistance+1;
        }

        int rightDistance=solve(root.right,target,k);

        if(rightDistance!=-1)
        {
            if(rightDistance+1==k)
            {
                System.out.println(root.data);
            }
            else
            {
                printDown(root.left,k-rightDistance-2);
            }
            return rightDistance+1;
        }

        return -1;
    }


    public static void printDown(BinaryTreeNode<Integer> root,int k)
    {
        if(root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.println(root.data);
        }
        printDown(root.left,k-1);
        printDown(root.right,k-1);
    }

}

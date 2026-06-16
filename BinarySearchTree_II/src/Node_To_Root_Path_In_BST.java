import java.util.ArrayList;
public class Node_To_Root_Path_In_BST
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root=BinaryTreeUse.takeInputLevelWise();
        ArrayList<Integer> path=getPath(root,5);
        for(int i:path)
        {
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int node)
    {
        if(root==null)
        {
            ArrayList<Integer> output=new ArrayList<>();
            return output;
        }
        if(node==root.data)
        {
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> output;
        if(node<root.data)
        {
            output=getPath(root.left,node);
        }
        else
        {
            output=getPath(root.right,node);
        }

        if(output.size()>0)
        {
            output.add(root.data);
        }
        return output;
    }
}

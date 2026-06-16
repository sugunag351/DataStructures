public class ConstructBST
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root=SortedArrayToBST(arr,7);
        BinaryTreeUse.printLevelWise(root);
    }
    //Time Complexity O(n)
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return helper(arr,0,n-1);
    }
    public static BinaryTreeNode<Integer> helper(int[] arr,int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        int rootData=arr[mid];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);

        BinaryTreeNode<Integer> leftOutput=helper(arr,si,mid-1);
        BinaryTreeNode<Integer> rightOutput=helper(arr,mid+1,ei);

        root.left=leftOutput;
        root.right=rightOutput;

        return root;
    }
}

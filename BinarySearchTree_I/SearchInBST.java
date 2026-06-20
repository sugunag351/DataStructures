package BinarySearchTree_I;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.BinaryTreeUse;

public class SearchInBST
{
    public static void main(String[] args)
    {
        BinaryTreeNode<Integer> root= BinaryTreeUse.takeInputLevelWise();
        System.out.println(searchInBST(root,5));

    }
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k)
    {

		/*
		    Time Complexity:

            For both recursive and iterative versions:
                ->Best Case: O(1) (key found at root)
                ->Average Case: O(log n) for a balanced BST
                ->Worst Case: O(n) for a skewed BST
		*/
        //Recursive search
        //Space Complexity: O(h) where h is the tree height.
        if(root==null)
        {
            return false;
        }


        if(root.data==k)
        {
            return true;
        }
        if(k<root.data)
        {
            return  searchInBST(root.left,k);
        }
        return searchInBST(root.right,k);

			/*
			//Iterative search
			//Space Complexity: O(1)
			while(root!=null)
			{
				if(root.data==k)
				{
					return true;
				}
				else if(k<root.data)
				{
					root=root.left;
				}
				else
				{
					root=root.right;
				}
			}
			return false;
			*/
    }
}

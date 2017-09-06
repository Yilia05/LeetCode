/**
 * Created by Yilia05 on 2017/4/25 0025.
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 */
//public class No108_ConvertSortedArraytoBinarySearchTree
//{
//    public TreeNode sortedArrayToBST(int[] nums)
//    {
//        int n = nums.length;
//        return toTree(nums,0,n-1);
//
//    }
//
//    private TreeNode toTree(int[] nums,int start,int end)
//    {
//        if(start>end)
//        {
//            return null;
//        }
//        int mid = (start+end)/2;
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = toTree(nums,start,mid-1);
//        root.right = toTree(nums,mid+1,end);
//        return root;
//    }
//
//
//}

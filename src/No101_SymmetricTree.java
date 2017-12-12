/**
 * Created by yzhang46 on 2017/12/12.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric
 */
public class No101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left==null || root.right==null){
            return false;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        return help(left,right);
    }

    public static boolean help(TreeNode left,TreeNode right){
        if (left==null && right==null){
            return true;
        }
        if (left==null || right==null){
            return false;
        }
        if (left.val == right.val){
            return help(left.left,right.right) && help(left.right,right.left);
        }
        else{
            return false;
        }
    }
}

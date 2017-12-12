/**
 * Created by yzhang46 on 2017/12/12.
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class No100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return false;
        }
        if(p==null && q==null){
            return true;
        }
        if(p.val == q.val) {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        else{
            return false;
        }
    }
}

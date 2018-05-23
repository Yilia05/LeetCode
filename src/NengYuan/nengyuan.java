//package NengYuan;
//
//import javax.swing.tree.TreeNode;
//
///**
// * Definition for binary tree
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//public class nengyuan {
//  TreeNode pre, p, q;
//
//  public void recoverTree(TreeNode root) {
//    pre = p = q = null;
//    dfs(root);
//    int tmp = p.val;
//    p.val = q.val;
//    q.val = tmp;
//  }
//
//  public void dfs(TreeNode root) {
//    if (root == null) {
//      return;
//    }
//    dfs(root.left);
//    if (pre != null && pre.val > root.val) {
//      if (p == null) {
//        p = pre;
//        q = root;
//      } else {
//        q = root;
//      }
//    }
//    pre = root;
//    dfs(root.right);
//  }
//
//}
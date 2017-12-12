import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Created by yzhang46 on 2017/10/18.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
public class No107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> sublist = new LinkedList<>();
            int levelNum = queue.size();
            for(int i = 0; i<levelNum; i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            lists.add(0, sublist);
        }
        return lists;
    }
}

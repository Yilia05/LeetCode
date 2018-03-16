import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by yzhang46 on 2017/11/29.
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 */
public class No257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }
    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null)
            answer.add(path + root.val);
        if (root.left != null)
            searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null)
            searchBT(root.right, path + root.val + "->", answer);
    }
}

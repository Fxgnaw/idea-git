package test;


import java.util.ArrayList;
import java.util.List;

public class L34 {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target, new ArrayList<Integer>());
        return list;
    }

    private void dfs(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            List<Integer> l = new ArrayList<>(path);
            list.add(l);

        }
        dfs(root.left, target, path);
        dfs(root.right, target, path);
        path.remove(path.size() - 1);
    }
}

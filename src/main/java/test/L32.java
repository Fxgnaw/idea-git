package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L32 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (flag) {
                for (int i = 0; i < list.size() / 2; i++) {
                    int temp = list.get(i);
                    list.set(i, list.get(list.size() - 1 - i));
                    list.set(list.size() - 1 - i, temp);
                }
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }
}

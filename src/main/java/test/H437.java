package test;

public class H437 {
    int res = 0;

    public int pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new int[1000], 0);
        return res;
    }

    private void dfs(TreeNode root, int targetSum, int[] arr, int index) {

        if (root == null) return;
        arr[index] = root.val;
        int sum = 0;
        for (int i = index; i >= 0; i--) {
            sum += arr[i];
            if (sum == targetSum) {
                res++;
            }
        }
        dfs(root.left, targetSum, arr, index + 1);
        dfs(root.right, targetSum, arr, index + 1);
    }
}

package test;

import java.util.HashMap;

public class H560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }

    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }
        int target = (sum + S) / 2;
        int[][] dp = new int[nums.length][target + 1];
        dp[0][0] = 1;
        if (nums[0] <= target) {
            dp[0][nums[0]] += 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i])
                    dp[i][j] += dp[i - 1][j - nums[i]];
            }
        }
        return dp[nums.length - 1][target];
    }
}

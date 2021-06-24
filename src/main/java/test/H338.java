package test;

public class H338 {
    public int[] countBits(int n) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i = i * 2) {
            for (int j = 0; j < i; j++) {
                if (i + j <= n) {
                    dp[i + j] = 1 + dp[j];
                }
            }
        }
        return dp;
    }
}

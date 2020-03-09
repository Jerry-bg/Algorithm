package com.kons.dp;

public class LeetCode_96 {
    private static int numTrees(int n) {
        if (n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int temp = dp[i - 1];
            for (int j = 0; j < i / 2; j++) {
                if (j - 0 == 0) dp[i] += dp[j - 0] * temp * 2;
                else dp[i] += dp[j - 0] * dp[i - j - 1] * 2;
            }
            if (i % 2 == 1) dp[i] += dp[i / 2] * dp[i / 2];
        }
        return dp[n];
    }
}

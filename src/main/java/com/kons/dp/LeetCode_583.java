package com.kons.dp;

public class LeetCode_583 {
    public int minDistance(String word1, String word2) {
        int row = word1.length();
        int col = word2.length();
        int[][] dp = new int[row + 1][col + 1];
        dp[0][0] = 0;
        for (int i = 1; i < row + 1; i++)
            dp[i][0] = i;
        for (int i = 1; i < col + 1; i++)
            dp[0][i] = i;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[row][col];
    }
}

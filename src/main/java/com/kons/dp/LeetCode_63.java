package com.kons.dp;

public class LeetCode_63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        if (row <= 0) return 0;
        int col = obstacleGrid[0].length;
        if (col <= 0) return 0;

        int start = obstacleGrid[0][0] == 1 ? 0 : 1;
        if (row == 1 && col == 1) return start;

        int[][] dp = new int[row][col];
        dp[0][0] = start;
        for (int i = 1; i < row; i++)
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
        for (int i = 1; i < col; i++)
            dp[0][i] = obstacleGrid[0][i] == 1 ? 0 : dp[0][i - 1];

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[row - 1][col - 1];
    }
}

package com.kons.dp;

import java.util.Arrays;

public class LeetCode_983 {
    public static int mincostTickets(int[] days, int[] costs) {
        int dLen = days[days.length - 1] + 1;
        int[] dp = new int[dLen];
        Arrays.fill(dp, -1);
        for (int i : days)
            dp[i] = Integer.MAX_VALUE;
        int temp = 0;
        dp[0] = 0;
        for (int i = 1; i < dLen; i++) {
            if (dp[i] > 0) {
                temp = dp[i];
                int d1 = (i - 1) < 0 ? 0 : (i - 1);
                int d7 = (i - 7) < 0 ? 0 : (i - 7);
                int d30 = (i - 30) < 0 ? 0 : (i - 30);
                temp = Math.min(temp, Math.min(dp[d1] + costs[0], Math.min(dp[d7] + costs[1], dp[d30] + costs[2])));
            }
            dp[i] = temp;
        }

        return dp[dLen - 1];
    }
}

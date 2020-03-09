package com.kons.dp;

public class LeetCode_121 {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len<=1) return 0;
        int[] dp=new int[len];
        int minVal=Math.min(prices[0],prices[1]);
        dp[0]=0;
        dp[1]=(prices[1]-prices[0])<0?0:(prices[1]-prices[0]);
        for (int i=2;i<len;i++){
            minVal=prices[i]<minVal?prices[i]:minVal;
            dp[i]=Math.max(prices[i]-minVal,dp[i-1]);
        }
        return dp[len-1];
    }
}

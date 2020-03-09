package com.kons.dp;

public class LeetCode_213 {
    public int rob(int[] nums) {
        int s=Math.max(method(nums,0,nums.length-1),method(nums,1,nums.length));
        return s;
    }

    private int method(int[] nums,int start,int end){
        int len=end-start;
        int[] dp=new int[len];
        if (len>=1) dp[0]=nums[start];
        if (len>=2) dp[1]=Math.max(nums[start],nums[start+1]);

        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-2]+nums[start+i],dp[i-1]);
        }

        return dp[len-1];
    }
}

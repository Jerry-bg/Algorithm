package com.kons.dp;

/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */

public class LeetCode_5 {
    public String longestPalindrome(String s) {
        String src=initStr(s);
        int len=src.length();
        int[] dp=new int[len];
        int id=0,mx=0;
        int mxMid=0,mxLen=0;

        for(int i=1;i<len;i++){
            if(i<mx) dp[i]=Math.min(mx-i,dp[2*id-i]);
            else dp[i]=1;

            while ((i-dp[i]>=0&&i+dp[i]<len)&&(s.charAt(i-dp[i])==s.charAt(i+dp[i])))
                dp[i]++;
            if(mx<dp[i]+i){
                mx=dp[i]+i;
                id=i;
            }
            if(mxLen<dp[i]){
                mxLen=dp[i];
                mxMid=i;
            }
        }
        return src.substring(mxMid-mxLen+1,mxMid+mxLen).replace("#","");
    }

    private String initStr(String s){
        StringBuilder stringBuilder=new StringBuilder();
        for (char c:s.toCharArray()){
            stringBuilder.append("#"+c);
        }
        stringBuilder.append("#");
        return stringBuilder.toString();
    }
}

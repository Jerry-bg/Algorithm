package com.kons.dp;

public class LettCode_3 {
    public int LengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int len=1,rs=1;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int n=stringBuilder.toString().indexOf(s.charAt(i));
            if(n<0){
                stringBuilder.append(s.charAt(i));
                len++;
            }
            else {
                if(stringBuilder.length()!=n+1){
                    String sss = stringBuilder.append(s.charAt(i)).substring(n+1);
                    stringBuilder=new StringBuilder();
                    stringBuilder.append(sss);
                    len=stringBuilder.length();
                }
                else {
                    stringBuilder=new StringBuilder();
                    stringBuilder.append(s.charAt(i));
                    len=1;
                }
            }
            rs=len>rs?len:rs;
        }
        return rs;
    }
}

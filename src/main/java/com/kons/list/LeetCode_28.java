package list;

public class LeetCode_28 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty() || needle=="") return 0;
        if(haystack.length()<needle.length()) return -1;

        int i=0,j=0;
        for (;i<haystack.length();i++){
            if(j>=needle.length())
                break;
            else if(haystack.charAt(i)==needle.charAt(j))
                j++;
            else {
                if(j>0) i-=j;
                j=0;
            }
        }
        if(i==haystack.length() && j!=needle.length()) return -1;
        else return i-=j;
    }
}

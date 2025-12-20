// 5. Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/description/

import java.util.*;

class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        for(int i=0;i<s.length();i++){
            int len1 = checkPalindrome(s,i,i);
            int len2 = checkPalindrome(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > right-left+1){
                left = i-(len-1)/2;
                right = i+(len/2);
            }
        }
        return s.substring(left,right+1);
    }

    public int checkPalindrome(String s,int left, int right){
        int l = left, r = right;
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}





public class LongestPalindromicSubstring {
    public static void main (String[] args) {
    String s = "cbbd";

    Solution sol = new Solution();
    System.out.println(sol.longestPalindrome(s));
    }
}


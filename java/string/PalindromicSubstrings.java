// 647. Palindromic Substrings
// https://leetcode.com/problems/palindromic-substrings/description/

import java.util.*;

class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            ans += checkPalindrome(s,i,i); // odd paindromic
            ans += checkPalindrome(s,i,i+1); // even palindromic
        }
        return ans;
    }

    public int checkPalindrome(String s,int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
            count ++;
        }
        return count;
    }
}





public class PalindromicSubstrings {
    public static void main (String[] args) {
    String s = "abc";

    Solution sol = new Solution();
    System.out.println(sol.countSubstrings(s));
    }
}


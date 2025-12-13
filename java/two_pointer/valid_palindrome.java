// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/


import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

}






public class valid_palindrome {
    public static void main (String[] args) {
    String s = "A man, a plan, a canal: Panama";

    Solution sol = new Solution();
    System.out.println(sol.isPalindrome(s));
    }
}


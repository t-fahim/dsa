// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/description/

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        // check if length are different
        if (s.length() != t.length()){
            return false;
        }

        // creating an array to cont character frequence
        int[] char_count = new int[26];

        // increment count for each character in 's' and decrement for each in 't'
        for(int i =0;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }

        // check if all counts are zero
        for(int count:char_count){
            if (count !=0){
                return false;
            }
        }
        return true; // all count are zero
    }
}






public class valid_anagram {
    public static void main (String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution sol = new Solution();
        System.out.println(sol.isAnagram(s,t));
    }
}


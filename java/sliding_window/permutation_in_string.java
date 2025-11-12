// 567. Permutation in String
// https://leetcode.com/problems/permutation-in-string/description/

import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int [] s1map = new int[26];
        int [] s2map = new int[26];

        // initialize frequency maps for s1 and the first window of s2
        for (int i = 0; i< s1.length();i++){
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) -'a']++;
        }

        // slide the window through s2 and compare the maps
        for(int i = 0;i<s2.length()-s1.length();i++){
            if (matches(s1map,s2map)){
                return true;
            }
            s2map[s2.charAt(i+s1.length()) - 'a'] ++; // add new char to the window
            s2map[s2.charAt(i) - 'a'] -- ; // remove old character form the window
        }
        // check the last window
        return matches(s1map,s2map);
    }

    // helper function to compare two frequency map
    public boolean matches(int[] s1map, int[] s2map){
        for(int i =0;i<26;i++){
            if (s1map[i] != s2map[i]){
                return false;
            }
        }
        return true;
    }
}






public class permutation_in_string {
    public static void main (String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        Solution sol = new Solution();
        System.out.println(sol.checkInclusion(s1,s2));
    }
}


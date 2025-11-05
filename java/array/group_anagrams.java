// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/description/

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0){
            // returns a new, empty ArrayList
            return new ArrayList<>();
        }
        // creating hashmap
        Map<String, List> ans_map = new HashMap<>();

        int[] count = new int[26];

        for (String s:strs){
            Arrays.fill(count,0);

            for(char c:s.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if(!ans_map.containsKey(key)){
                ans_map.put(key,new ArrayList<>());
            }

            ans_map.get(key).add(s);

        }
        return new ArrayList(ans_map.values());

    }
}






public class group_anagrams {
    public static void main (String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Solution sol = new Solution();
        System.out.println(sol.groupAnagrams(strs));



    }
}


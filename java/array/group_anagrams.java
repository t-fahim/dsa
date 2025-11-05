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

            // convert each s into a character array
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }

            // create sb for key generation
            StringBuilder sb = new StringBuilder("");

            for(int i=0;i<26;i++){
                // '#' is just a delimiter to avoid ambiguity (so counts like 1 and 11 don’t mix)
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            // if key not in hashmap then add key with a emply arraylist
            if(!ans_map.containsKey(key)){
                ans_map.put(key,new ArrayList<>());
            }

            // add s to arraylist if its key equal to any key in arraylist
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


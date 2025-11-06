// 953. Verifying an Alien Dictionary
// https://leetcode.com/problems/verifying-an-alien-dictionary/

import java.util.*;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> order_map = new HashMap<>();
        // Add echa character of order in hashmap
        for (int i=0;i<order.length();i++){
            order_map.put(order.charAt(i),i);
        }
        for(int i =0;i<words.length-1;i++){
            for(int j=0;j<words[i].length();j++){
                // batman , bat
                if(j>=words[i+1].length()){
                    return false;
                }
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int curr_letter = order_map.get(words[i].charAt(j));
                    int next_letter = order_map.get(words[i+1].charAt(j));
                    if(next_letter<curr_letter){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}






public class is_alien_sorted {
    public static void main (String[] args) {
    String[] words = {"word","world","row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    Solution sol = new Solution();
    System.out.println(sol.isAlienSorted(words,order));

    }
}


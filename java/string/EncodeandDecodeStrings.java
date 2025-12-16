// Encode and Decode Strings
// https://neetcode.io/problems/string-encode-and-decode/question
// the link is from neetcode because to view the problem leetcode subscribtion needed

import java.util.*;

class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String separate = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s);
            sb.append(separate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258))){
            return new ArrayList();
        }
        String separate = Character.toString((char)257);
        return Arrays.asList(str.split(separate,-1));

    }
}







public class EncodeandDecodeStrings {
    public static void main (String[] args) {

    List<String> input = Arrays.asList("neet","code","love","you");

    Solution sol = new Solution();
    String result = sol.encode(input);

    System.out.println(sol.decode(result));
    }
}


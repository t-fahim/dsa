// 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/description/

import java.util.*;

class Solution {
    // creating static hashmap
    // Roman numeral lookup table — is constant for all objects.
    // static means the variable belongs to the class itself,
    // not to any object (instance) of the class.
    static Map<String,Integer> values = new HashMap<>();
    static{
        values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);
        values.put("IV",4);
        values.put("IX",9);
        values.put("XL",40);
        values.put("XC",90);
        values.put("CD",400);
        values.put("CM",900);
    }
    public int romanToInt(String s) {

        int sum = 0;
        int i = 0;
        while(i<s.length()){
            // prevents substring(i, i+2) from going out of bounds
            // when at last character.
            if(i<s.length()-1){
                String two_symbol = s.substring(i,i+2);
                if(values.containsKey(two_symbol)){
                    sum += values.get(two_symbol);
                    i = i+2;
                    // Add continue so that when a two-symbol Roman numeral is found, the single-character logic doesn’t run
                    continue;
                }
            }
            String one_symbol = s.substring(i,i+1);
            sum += values.get(one_symbol);
            i = i+1;
        }
        return sum;
    }
}






public class roman_to_integer {
    public static void main (String[] args) {
        String s = "MCMXCIV";
        Solution sol = new Solution();
        System.out.println(sol.romanToInt(s));
    }
}


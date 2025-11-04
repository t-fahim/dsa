// 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create hashset to store unique elements from the array
        HashSet<Integer> seen_number = new HashSet<>();

        // iterate through each element in array
        for (int num : nums){
            // check if the element is already in the hashset
            if (seen_number.contains(num)){
                return true;
            }
            // add element to hashset
            seen_number.add(num);
        }
        return false; // no duplicate
    }
}


public class contains_duplicate{
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        Solution sol = new Solution();
        System.out.println(sol.containsDuplicate(nums));
    }
}

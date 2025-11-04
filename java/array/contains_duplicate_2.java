// 219. Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/description/

import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create hashset to store unique elements from the array
        HashSet<Integer> set = new HashSet<>();

        // iterate through each element in array
        for (int i=0;i<nums.length;i++){
            // check if the element is already in the hashset
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            // when lenght > k remove first element form hashset
            if (set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false; // no duplicate
    }
}






public class contains_duplicate_2 {
    public static void main (String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        Solution sol = new Solution();
        System.out.println(sol.containsNearbyDuplicate(nums,k));
    }
}


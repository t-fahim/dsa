// leetcode 1. Two Sum
// https://leetcode.com/problems/two-sum/description

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution{
    public int[] twoSum(int[] nums, int target){
        // create a hashpmap to store numbers and their indices
        Map<Integer,Integer> map = new HashMap<>();

        // iterate through the array
        for (int i = 0;i<nums.length;i++){
            // calculate the complement of the current number
            int complement = target - nums[i];

            // check if the complement is already in the map
            if (map.containsKey(complement)){
                // if found, return the indices of the complement and the curent number
                return new int[] {map.get(complement),i};
            }

            // otherwise, add the current number and index to the map
            map.put(nums[i],i);
        }
        // return an empty array if no solution is found
        return new int[] {};
    }
}




public class two_sum{
    public static void main(String[] args){
    int[] nums = {2,7,11,15};
    int target = 9;
    Solution sol = new Solution();
    int [] result = sol.twoSum(nums,target);
    System.out.println(Arrays.toString(result));
    }
}

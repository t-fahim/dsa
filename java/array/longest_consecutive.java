// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // If the input array is empty, there are no consecutive numbers
        if(nums.length==0){
            return 0;
        }
        // Use a HashSet to store all unique numbers
        HashSet<Integer> num_set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            num_set.add(nums[i]);
        }
        int longest_sub = 1;

        for(int num:num_set){
            // Only start counting if 'num' is the beginning of a sequence
            if(num_set.contains(num-1)){
                continue; // Skip if not a sequence start
            }
            else{
                int current_num = num;
                int current_sub = 1;
                while(num_set.contains(current_num+1)){
                    current_num ++;
                    current_sub ++;
                }
                longest_sub = Math.max(longest_sub,current_sub);
            }
        }
        return longest_sub;
    }
}






public class longest_consecutive {
    public static void main (String[] args) {
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    Solution sol = new Solution();
    System.out.println(sol.longestConsecutive(nums));
    }
}


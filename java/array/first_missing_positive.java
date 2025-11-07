// 41. First Missing Positive
// https://leetcode.com/problems/first-missing-positive/description/

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int contains = 0;
        // Step 1: Check if 1 exists in the array
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                contains ++;
                break;
            }
        }
        // If 1 is missing, answer is 1
        if(contains == 0){
            return 1;
        }

        // Step 2: Replace invalid numbers (≤ 0 or > n) with 1
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i] >n){
                nums[i] = 1;
            }
        }

        // Step 3: Use index marking
        // For each number, mark its corresponding index negative
        for(int i =0;i<n;i++){
            int a = Math.abs(nums[i]);
            if(a==n){
                nums[0] = -Math.abs(nums[0]); // mark index 0 for 'n'
            }
            else{
                nums[a] = -Math.abs(nums[a]);
            }
        }

        // Step 4: Find the first index with a positive number
        for(int i=1;i<n;i++){
            if(nums[i]>0){
                return i;
            }
        }

        // Step 5: Check if n is missing
        if(nums[0]>0){
            return n;
        }

        // Otherwise, all numbers 1..n are present
        return n+1;
    }
}







public class first_missing_positive {
    public static void main (String[] args) {
    int[] nums = {7,8,9,11,12};
    Solution sol = new Solution();
    System.out.println(sol.firstMissingPositive(nums));
    }
}


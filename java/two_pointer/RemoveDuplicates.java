// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1;i<nums.length;i++){
            // skip to next index if we see a duplicate element
            if(nums[i-1] != nums[i]){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}






public class RemoveDuplicates {
    public static void main (String[] args) {

    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    Solution sol = new Solution();
    System.out.println(sol.removeDuplicates(nums));
    }
}


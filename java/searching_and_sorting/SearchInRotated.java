// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                if(target < nums[left] || target > nums[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                if(target > nums[right] || target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}





public class SearchInRotated {
    public static void main (String[] args) {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    Solution sol = new Solution();
    System.out.println(sol.search(nums,target));
    }
}


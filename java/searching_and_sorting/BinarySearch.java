// 704. Binary Search
// https://leetcode.com/problems/binary-search/description/

import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;// target not found
    }
}






public class BinarySearch {
    public static void main (String[] args) {
    int[] nums = {-1,0,3,5,9,12};
    int target = 9;

    Solution sol = new Solution();
    System.out.println(sol.search(nums,target));
    }
}


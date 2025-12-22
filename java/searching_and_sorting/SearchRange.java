// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = this.findBound(nums,target,true);
        if(first == -1){
            return new int[]{-1,-1};
        }
        int last = this.findBound(nums,target,false);
        return new int[]{first,last};
    }

    public int findBound(int[] nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = end + (start-end)/2;
            if(nums[mid]==target){
                if(isFirst){
                    if(mid == start || nums[mid-1]!=target){
                        return mid;
                    }
                    end = mid-1;
                }
                else{
                    if(mid==end || nums[mid+1]!=target){
                        return mid;
                    }
                    start = mid + 1;
                }
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}






public class SearchRange {
    public static void main (String[] args) {

    int[] nums = {5,7,7,8,8,10};
    int target = 8;
    Solution sol = new Solution();
    System.out.println(Arrays.toString(sol.searchRange(nums,target)));
    }
}


// 75. Sort Colors
// https://leetcode.com/problems/sort-colors/description/
// Dutch national flag algorithm

import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while(current <= high){
            if(nums[current] == 0){
                swap(nums,current,low);
                low++;
                current++;
            }
            else if(nums[current] == 2){
                // current is not forward in this case  because the swapped
                // element from high could be 0.
                swap(nums,current,high);
                high--;
            }
            else{
                current++;
            }
        }
    }

    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}





public class SortColors {
    public static void main (String[] args) {
    int[] nums = {2,0,2,1,1,0};

    Solution sol = new Solution();
    sol.sortColors(nums);
    }
}


// 167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                return new int[] {left+1,right+1};
            }
        }
        return null;
    }

}






public class two_sum_2_sorted {
    public static void main (String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 9;

    Solution sol = new Solution();
    System.out.println(Arrays.toString(sol.twoSum(numbers,target)));
    }
}


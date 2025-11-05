// 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/

import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // set initiall value 1
        Arrays.fill(result,1);
        int prefix = 1;
        int postfix = 1;
        for(int i = 0;i<nums.length;i++){
            result[i] = prefix;
            prefix = prefix*nums[i];
        }

        for(int i = nums.length-1;i>=0;i--){
            result[i] = result[i]*postfix;
            postfix = nums[i]*postfix;
        }
        return result;
    }
}






public class product_except_self {
    public static void main (String[] args) {
        int[] nums = {-1,1,0,-3,3};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
    }
}


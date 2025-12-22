// 169. Majority Element
// https://leetcode.com/problems/majority-element/description/
// Boyer–Moore Voting Algorithm:

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num==candidate)?1:-1;
        }
        return candidate;
    }
}




public class MajorityElement {
    public static void main (String[] args) {
    int[] nums = {2,2,1,1,1,2,2};

    Solution sol = new Solution();
    System.out.println(sol.majorityElement(nums));
    }
}


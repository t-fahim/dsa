// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/description/

import java.util.*;

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int total = 0;
        int leftmax = height[0];
        int rightmax = height[right];
        while(left < right){
            if(height[left] < height[right]){
                leftmax = Math.max(leftmax,height[left]);
                if(leftmax-height[left]>0){
                    total = total + leftmax - height[left];
                }
                left++;
            }
            else{
                rightmax = Math.max(rightmax,height[right]);
                if(rightmax - height[right] > 0){
                    total = total+rightmax - height[right];
                }
                right--;
            }
        }
        return total;

    }
}





public class TrappingRainWater {
    public static void main (String[] args) {

    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    Solution sol = new Solution();
    System.out.println(sol.trap(height));
    }
}


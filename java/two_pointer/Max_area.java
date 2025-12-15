// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/

import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int width = right - left;
            int area = Math.min(height[left],height[right])*width;
            max_area = Math.max(max_area,area);
            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;

    }
}






public class Max_area {
    public static void main (String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};

    Solution sol = new Solution();
    System.out.println(sol.maxArea(height));
    }
}


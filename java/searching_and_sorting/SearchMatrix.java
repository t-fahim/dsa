// 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/description/

import java.util.*;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            int midvalue = matrix[mid/n][mid%n];
            if(midvalue ==target){
                return true;
            }
            else if(midvalue < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }
}




public class SearchMatrix {
    public static void main (String[] args) {
    int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 13;

    Solution sol = new Solution();
    System.out.println(sol.searchMatrix(matrix,target));
    }
}


// 239. Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/description


import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // edge cases
        if (nums.length == 1){
            return nums;
        }

        int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i=0;i<n;i++){
            // remove indices that are out of the current window
            while(!deque.isEmpty() && deque.peek() < i-k+1){
                deque.poll();
            }

            // removing indices whose corresponding values are less than nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }

            // add the current index to the deque
            deque.offer(i);

            // add the maximum element of the current window to the result
            if(i >= k-1){
                result[i-k+1] = nums[deque.peek()];
            }
        }
        return result;

    }
}






public class sliding_window_max {
    public static void main (String[] args) {
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k = 3;
    Solution sol = new Solution();
    System.out.println(Arrays.toString(sol.maxSlidingWindow(nums,k)));
    }
}


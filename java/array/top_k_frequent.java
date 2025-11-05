// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // when length of nums equal to k return nums
        if (k == nums.length){
            return nums;
        }

        // creating hashmap
        Map<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            // Increment the frequency/count of n in the map.
            // If n is not present, start the count at 0 and then add 1.
            count.put(n,count.getOrDefault(n,0)+1);
        }

        // Create a min-heap (priority queue) of integers,
        // ordered by their frequency stored in the 'count' map.
        // The integer with the smallest frequency comes first.
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b)-> count.get(a)-count.get(b)
        );

        for(int n:count.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }

        return ans;

    }
}






public class top_k_frequent {
    public static void main (String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.topKFrequent(nums,k)));
    }
}


// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}





public class max_profit {
    public static void main (String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution sol = new Solution();
        System.out.println(sol.maxProfit(prices));
    }
}


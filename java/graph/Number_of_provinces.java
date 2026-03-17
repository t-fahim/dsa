// 547. Number of Provinces
// https://leetcode.com/problems/number-of-provinces/description/

import java.util.*;

class Solution {
    public void bfs(int a, boolean[] vis, int[][] adj){
        int n = adj.length;
        vis[a] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        while(q.size() >0 ){
            int front = q.remove();
            for(int i=0;i<n;i++){
                if(adj[front][i] ==1 && vis[i] == false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
    int count = 0;
    int n = isConnected.length;
    // In Java, arrays are objects, and objects are passed by reference
    boolean[] vis = new boolean[n];
    for(int i = 0;i<n;i++){
        if(!vis[i]){
            bfs(i,vis,isConnected);
            count++;
        }
    }

    return count;
    }

}





public class Number_of_provinces{
    public static void main (String[] args) {
    int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};

    Solution sol = new Solution();
    System.out.println(sol.findCircleNum(isConnected));
    }
}


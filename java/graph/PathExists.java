// 1971. Find if Path Exists in Graph

import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0 ;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        bfs(source,adj,vis);
        return vis[destination];
    }

    private void bfs(int source, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while (q.size() > 0){
            int start = q.remove();
            vis[start] = true;
            for(int ele : adj.get(start)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }

        }

    }
}






public class PathExists {
    public static void main (String[] args) {
    int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};

    Solution sol = new Solution();
    System.out.println(sol.validPath(6,edges,0,5));
    }
}


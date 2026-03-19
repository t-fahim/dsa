// 785. Is Graph Bipartite?



import java.util.*;

class Solution {
	static boolean ans;

	public void bfs(int i, int[][] graph, int[] visited){
		Queue<Integer> q = new LinkedList<>();
		visited[i] = 0; // 0-> red, 1-> blue;
		q.add(i);
		while (q.size() > 0) {
			int front = q.remove();
			int color = visited[front];
			for(int ele : graph[front]){
				if(visited[front] == visited[ele]){
					ans = false;
					return ;
				}
				if(visited[ele] == -1){
					q.add(ele);
					visited[ele] = 1-color;
				}
			}
		}
	}

    public boolean isBipartite(int[][] graph) {
    	ans = true;
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        
        for(int i=0;i<n;i++){
        	if(visited[i] == -1){
        		if(ans == false){
        			return ans; 
        		}
        		bfs(i,graph,visited);
        	}
        }
        return ans;
    }
}


public class Bipartite {
    public static void main(String[] args) {
    	int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        Solution sol = new Solution();
        System.out.println(sol.isBipartite(graph));
    }
}
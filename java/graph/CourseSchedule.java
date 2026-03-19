// 207. Course Schedule




import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	List<List<Integer>> adj = new ArrayList<>();
    	for(int i=0;i<numCourses;i++){
    		adj.add(new ArrayList<>());
    	}
    	int[] indegree = new int[numCourses];
    	boolean[] vis = new boolean[numCourses];

    	for(int i=0;i<prerequisites.length;i++){
    		int a = prerequisites[i][0];
    		int b = prerequisites[i][1];
    		adj.get(b).add(a); // b->a edge
    		indegree[a]++;
    		
    	}
        // kans's algorithm
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
        	if(indegree[i]==0){
        		q.add(i);
        		vis[i] = true;
        	}
        }
        while(q.size()>0){
        	int front = q.remove();
        	ans.add(front);
        	for(int ele : adj.get(front)){
        		indegree[ele]--;
        		if(indegree[ele] == 0){
        			q.add(ele);
        			vis[ele] = true;
        		}
        	}
        }

        if(ans.size() == numCourses){
        	return true;
        }
        else {
        	return false;
        }

    }
}


public class CourseSchedule {
    public static void main(String[] args) {
    	int numCourses = 2;
    	int[][] prerequisites = {{1,0},{0,1}};
        Solution sol = new Solution();
        System.out.println(sol.canFinish(numCourses,prerequisites));
    }
}
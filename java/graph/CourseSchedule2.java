// 210. Course Schedule II




import java.util.*;


class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        	int[] arr = new int[numCourses];
        	for(int i = 0; i < numCourses; i++){
        	    arr[i] = ans.get(i);
        	}
        	return arr;
        }
        else {
        	return new int[0];
        }

    }
}

public class CourseSchedule2 {
    public static void main(String[] args) {
    	int numCourses = 4;

    	int[][] prerequisites = {
    	    {1, 0},
    	    {2, 0},
    	    {3, 1},
    	    {3, 2}
    	};

        Solution sol = new Solution();
        //System.out.println(sol.findOrder(numCourses,prerequisites));
        System.out.println(Arrays.toString(sol.findOrder(numCourses, prerequisites)));
    }
}
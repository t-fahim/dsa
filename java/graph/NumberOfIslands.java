// 200. Number of Islands


import java.util.*;

class Solution {

	public void dfs(int row, int col, char[][] grid, boolean[][] vis){
	    int m = grid.length;
	    int n = grid[0].length;
	    
	    vis[row][col] = true;

	    // top
	    if(row-1 >= 0 && !vis[row-1][col] && grid[row-1][col]=='1'){
	        dfs(row-1, col, grid, vis);
	    }
	    // bottom
	    if(row+1 < m && !vis[row+1][col] && grid[row+1][col]=='1'){
	        dfs(row+1, col, grid, vis);
	    }
	    // left
	    if(col-1 >= 0 && !vis[row][col-1] && grid[row][col-1]=='1'){
	        dfs(row, col-1, grid, vis);
	    }
	    // right
	    if(col+1 < n && !vis[row][col+1] && grid[row][col+1]=='1'){
	        dfs(row, col+1, grid, vis);
	    }
	}

	class Pair{
		int row;
		int col;
		Pair(int row,int col){
			this.row = row;
			this.col = col;
		}
	}

	public void bfs(int row, int col, char[][] grid, boolean[][] vis){
		int m = grid.length;
        int n = grid[0].length;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(row,col));
		vis[row][col] = true;
		while(q.size() > 0){
			Pair front = q.remove();
			int i = front.row;
			int j = front.col;
			
			// top
			if((i)>0){
				if(vis[i-1][j] == false && grid[i-1][j] == '1'){
					q.add(new Pair(i-1,j));
					vis[i-1][j] = true;
				}
			}
			
			// bottom
			if((i+1)<m){
				if(vis[i+1][j] == false && grid[i+1][j] == '1'){
					q.add(new Pair(i+1,j));
					vis[i+1][j] = true;
				}
			}

			// left
			if((j) > 0){
				if(vis[i][j-1] == false && grid[i][j-1] == '1'){
					q.add(new Pair(i,j-1));
					vis[i][j-1] = true;
				}
			}

			// right
			if((j+1)<n){
				if(vis[i][j+1] == false && grid[i][j+1] == '1'){
					q.add(new Pair(i,j+1));
					vis[i][j+1] = true;
				}
			}


		}
	}

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        boolean[][] vis = new boolean[m][n];

        for(int i = 0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(grid[i][j] == '1' && vis[i][j] == false){
        			//bfs(i,j,grid,vis);
        			dfs(i,j,grid,vis);
        			count++;
        		}
        	}
        }
        return count;
    }
}


public class NumberOfIslands{
    public static void main(String[] args) {
    	char[][] grid = {
    		{'1', '1', '0', '0', '0'},
    		{'1', '1', '0', '0', '0'},
    		{'0', '0', '1', '0', '0'},
    		{'0', '0', '0', '1', '1'}
		};

        Solution sol = new Solution();
        System.out.println(sol.numIslands(grid));
    }
}
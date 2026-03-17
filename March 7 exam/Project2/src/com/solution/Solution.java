package com.solution;

public class Solution {
    
	public static char[][] grid = {	{'1','1','1','1','0'},
									{'0','1','0','1','0'},
									{'1','1','0','0','1'},
									{'0','0','1','1','0'} };
	
	public static void main(String[] args) {
		Solution s = new Solution();
		for (char[] arr : grid) {
			for (char c : arr) System.out.print(c+" ");
			System.out.println();
		}
		System.out.println("Number of islands: " + s.numIslands(grid));
	}
	
	public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, ans = 0;
        for (int i=0; i<m; i++) for (int j=0; j<n; j++) if (grid[i][j]=='1') {
            numIslands(grid, i, j);
            ans++;
        }
        return ans;
    }
	
    public void numIslands(char[][] grid, int i, int j) {
        if (grid[i][j]=='0') return;
        grid[i][j] = '0';
        if (i>0) numIslands(grid, i-1, j);
        if (i<grid.length-1) numIslands(grid, i+1, j);
        if (j>0) numIslands(grid, i, j-1);
        if (j<grid[0].length-1) numIslands(grid, i, j+1);
    }

}

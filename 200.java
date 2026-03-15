class Solution {
    public void dfs(char[][] grid, int a, int b) {
        int m = grid.length;
        int n = grid[0].length;
        if(a<0 || b<0 || a>=m || b>=n || grid[a][b]=='0' || grid[a][b]=='2')
        {
            return;
        }
        grid[a][b]='2';
        dfs(grid,a-1,b);
        dfs(grid,a+1,b);
        dfs(grid,a,b+1);
        dfs(grid,a,b-1);
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
            {
                if (grid[i][j] == '1') 
                {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}
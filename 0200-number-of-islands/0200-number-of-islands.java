class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid, i,j,visited,m,n);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid,int i,int j,boolean[][] visited, int m, int n){
        if(i<0|| j<0|| i>=m|| j>=n|| grid[i][j]=='0'|| visited[i][j])
            return;
        visited[i][j]= true;
        dfs(grid, i-1,j,visited,m,n);
        dfs(grid, i+1,j,visited,m,n);
        dfs(grid, i,j-1,visited,m,n);
        dfs(grid, i,j+1,visited,m,n);
    }
}
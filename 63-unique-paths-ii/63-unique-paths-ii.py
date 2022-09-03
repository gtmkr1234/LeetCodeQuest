class Solution:
    def uniquePathsWithObstacles(self, grid: List[List[int]]) -> int:
        if grid[0][0]==1: return 0
        m=len(grid)
        n=len(grid[0])
        for i in range(0,m):
            for j in range(0,n):
                if i==0 or j==0:
                    if(grid[i][j]==1 or (i!=0 and grid[i-1][0]==0) or (j!=0 and grid[i][j-1]==0)):
                        grid[i][j] = 0
                    else:
                        grid[i][j] = 1
                else:
                    if grid[i][j]==1:
                        grid[i][j] = 0
                    else:
                        grid[i][j] = grid[i-1][j] + grid[i][j-1]
        return grid[m-1][n-1]
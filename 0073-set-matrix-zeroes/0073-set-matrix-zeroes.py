class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        #Better Solution
        """
        Do not return anything, modify matrix in-place instead.
        """
        r= len(matrix)
        c= len(matrix[0])
        
        row = [0 for i in range(r)]
        col = [0 for i in range(c)]
        
        for i in range(r):
            for j in range(c):
                if(matrix[i][j]==0):
                    row[i]=1
                    col[j]=1
        for i in range(r):
            for j in range(c):
                if(row[i]==1 or col[j]==1):
                    matrix[i][j]=0
        
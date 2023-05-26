def generateRows(i):
    res = [1]
    ans=1
    for j in range(1,i):
        ans*=(i-j)
        ans/=j
        res.append(int(ans))
    return res
    

class Solution:      
    
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(1,numRows+1):
            res.append(generateRows(i))
        return res
        
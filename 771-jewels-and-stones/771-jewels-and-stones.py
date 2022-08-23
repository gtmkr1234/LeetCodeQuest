class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        res:int = 0
        for j in jewels:
            for s in stones:
                if(s==j):
                    res+=1
        
        return res
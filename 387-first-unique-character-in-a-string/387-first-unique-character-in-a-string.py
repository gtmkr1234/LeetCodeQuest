class Solution:  
    def firstUniqChar(self, s: str) -> int:
        n= len(s)
        if n==0:
            return -1
        for i in range(0,n):
            if s.count(s[i])==1:
                return i
        return -1
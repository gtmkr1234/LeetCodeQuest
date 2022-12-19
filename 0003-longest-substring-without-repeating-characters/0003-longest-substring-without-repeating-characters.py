class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left=0
        res = 0
        hm = {}
        for r in range(len(s)):
            if s[r] in hm:
                left = max(left, hm[s[r]]+1)
            hm[s[r]] = r
            res = max(res, r-left+1)
        return res
        
class Solution:
    def dailyTemperatures(self, t: List[int]) -> List[int]:
        res = [0]*len(t)
        stk = []
        for i in range(len(t)):
            while(stk and t[i]>t[stk[-1]]):
                cnt = stk.pop()
                res[cnt] = i - cnt
            stk.append(i)
        return res
import sys
class Solution:
    def reverse(self, x: int) -> int:
        isNegetive = x<0
        if(isNegetive):
            x=x*-1
        reverse : int = 0
        lastdigit=0
        while(x>0):
            lastdigit = x%10
            reverse = reverse*10 + lastdigit
            x = x//10
        if(reverse>=2**31):
            return 0
        return reverse*-1 if(isNegetive) else reverse
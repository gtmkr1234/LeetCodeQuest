
class Solution:
    def fib(self, n: int) -> int:
        if n<=1:
            return n
        if n==2:
            return 1
        a = self.fib(n-1) + self.fib(n-2)
        return a
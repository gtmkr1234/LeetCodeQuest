class Solution:
    def average(self, salary: List[int]) -> float:
        total = 0
        for i in salary:
            if(i!=min(salary) and i!=max(salary)):
                total += i
        return total/(len(salary)-2)
            
        
        
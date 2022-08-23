class Solution:
    def average(self, salary: List[int]) -> float:
        maxValue = salary[0]
        minValue = salary[0]
        
        for i in range(len(salary)):
            maxValue=max(maxValue,salary[i])
            minValue=min(minValue,salary[i])
        
        total = 0
        for i in salary:
            if(i!=minValue and i!=maxValue):
                total += i
        return total/(len(salary)-2)
            
        
        
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        current=0
        for i in nums:
            if i!=0:
                nums[current] = i
                current+=1
        for j in range(current,len(nums)):
            nums[j] = 0
        
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i in range(len(nums)):
            cmp = target-nums[i]
            if cmp in d.keys():
                return [d[cmp], i]
            else:
                d[nums[i]] = i
        return []
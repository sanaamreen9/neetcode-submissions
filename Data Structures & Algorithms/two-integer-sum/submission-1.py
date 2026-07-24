class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res={}
        for i,num in enumerate(nums):
            compliment=target-num
            if compliment in res:
                return [res[compliment],i]
            res[num]=i
        
        return None
       
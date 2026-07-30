class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        n=len(nums)
        for i in range(0,n):
          j=i+1
          while(j<n):
            if(nums[i]>nums[j]):
              nums[i],nums[j]=nums[j],nums[i]
              j+=1
            elif(nums[i]<nums[j]):
              j+=1
            else:
              j+=1
        return nums
            
            
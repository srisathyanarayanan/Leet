class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        count=0
        for i in range(len(nums)):
            if i+2<len(nums):
                # print(nums[i+1])
                if (nums[i]+nums[i+2])==(nums[i+1])/2:
                    # print(nums[i],nums[i+1],nums[i+2])
                    count+=1
                else:
                    continue
        return count
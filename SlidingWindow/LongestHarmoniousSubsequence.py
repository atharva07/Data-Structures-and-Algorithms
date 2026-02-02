from typing import List

class LongestHarmoniousSubsequence:
    def findLHS(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        nums = sorted(nums)
        left = 0
        maxLen = 0

        for right in range(len(nums)):
            while nums[right] - nums[left] > 1:
                left += 1

            if nums[right] - nums[left] == 1:
                maxLen = max(maxLen, right - left + 1)

        return maxLen
        
def main():
    sol = LongestHarmoniousSubsequence()
    nums = [1,3,2,2,5,2,3,7]
    res = sol.findLHS(nums)
    print(res)

if __name__ == "__main__":
    main()
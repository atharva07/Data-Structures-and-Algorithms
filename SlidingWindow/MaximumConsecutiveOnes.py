from typing import List

class MaximumConsecutiveOnes:

    # complexity - O(n)
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_count = 0
        count = 0

        for num in nums:
            if num == 1:
                count += 1
                max_count = max(max_count, count)
            else:
                count = 0

        return max_count
    
    # using sliding window
    def findMaxConsecutiveOnesOptimal(self, nums: List[int]) -> int:
        right = 0
        left = 0
        ans = 0
        n = len(nums)

        while right < n:
            if nums[right] == 0:
                ans = max(ans, right - left)
                while right < n and nums[right] == 0:
                    right += 1
                left = right
            else:
                right += 1
        
        return max(ans, right - left)
    
def main():
    nums = [1,1,0,1,1,1]
    solution = MaximumConsecutiveOnes()
    print(solution.findMaxConsecutiveOnesOptimal(nums))

if __name__ == "__main__":
    main()
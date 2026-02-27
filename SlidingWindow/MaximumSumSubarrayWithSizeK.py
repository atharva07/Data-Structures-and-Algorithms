from typing import List

class MaximumSumSubarrayWithSizeK:
    def maximumSubarraysum(self, nums: List[int], k: int) -> int:
        windowSum = sum(nums[:k])
        max_sum = windowSum

        for right in range(k, len(nums)):
            windowSum += nums[right]
            windowSum -= nums[right - k]
            max_sum = max(max_sum, windowSum)

        return max_sum
    
def main():
    nums = [1,5,4,2,9,9,9]
    k = 3
    solution = MaximumSumSubarrayWithSizeK()
    print(solution.maximumSubarraysum(nums, k))

if __name__ == "__main__":
    main()
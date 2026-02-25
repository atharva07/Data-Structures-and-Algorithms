from typing import List

class MaximumAverageSubArray1:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        # calculate the sum for first window
        windowSum = 0
        for i in range(k):
            windowSum += nums[i]

        # initialize maxSum with first windowsum
        maxSum = windowSum

        for i in range(k, len(nums)):
            windowSum = windowSum - nums[i - k] + nums[i]

            maxSum = max(maxSum, windowSum)

        return maxSum/k
    
def main():
    nums = [1,12,-5,-6,50,3]
    k = 4
    sol = MaximumAverageSubArray1()
    res = sol.findMaxAverage(nums, k)
    print(res)

if __name__ == "__main__":
    main()
        

        
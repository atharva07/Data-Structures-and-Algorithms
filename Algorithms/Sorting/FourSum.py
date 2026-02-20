from typing import List

class FourSum:

    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        result = []
        nums.sort()
        n = len(nums)

        for i in range(n - 3):
            if i > 0 and nums[i] == nums[i-1]:
                continue

            for j in range(i+1, n-2):
                if j > i + 1 and nums[j] == nums[j-1]:
                    continue

                left = j + 1
                right = n - 1
                remainingTarget = target - nums[i] - nums[j]

                while left < right:
                    currentSum = nums[left] + nums[right]
                    if currentSum == remainingTarget:
                        result.append([nums[i], nums[j], nums[left], nums[right]])

                        while left < right and nums[left] == nums[left + 1]:
                            left += 1

                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1

                        left += 1
                        right -= 1

                    elif currentSum < remainingTarget:
                        left += 1

                    else:
                        right -= 1

        return result
    
def main():
    sol = FourSum()
    #nums = [1,0,-1,0,-2,2]
    nums = [2, 2, 2, 2, 2]
    target = 8
    result = sol.fourSum(nums, target)
    print(result)

if __name__ == "__main__":
    main()
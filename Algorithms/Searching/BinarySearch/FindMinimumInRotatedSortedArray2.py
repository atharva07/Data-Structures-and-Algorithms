from typing import List

class FindMinimumInRotatedSortedArray2:
    def find_minimum_2(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        while left < right:
            mid = left + (right - left) // 2

            if nums[mid] > nums[right]:
                left = mid + 1
            elif nums[mid] < nums[right]:
                right = mid
            else:
                right -= 1
        
        return nums[left]
    
def main():
    sol = FindMinimumInRotatedSortedArray2()
    nums = [1,3,3]
    res = sol.find_minimum_2(nums)
    print(res)

if __name__ == "__main__":
    main()
from typing import List

class MinimumInRotatedSortedArrray:
    def find_minimum(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        while left < right:
            mid = left + (right - left) // 2

            if nums[mid] > nums[right]:
                left = mid + 1
            else:
                right = mid
        
        return nums[left]
    
def main():
    sol = MinimumInRotatedSortedArrray()
    nums = [3,4,5,1,2]
    res = sol.find_minimum(nums)
    print(res)     

if __name__ == "__main__":
    main()
            
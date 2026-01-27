from typing import List

class SingleElementInSortedArray:
    def isNonDuplicateElement(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        # Lets say mid is even
        # and nums[mid] == nums[mid + 1], then the single element must be on the right side
        # else it is on the left side (including mid)
        while left < right:
            mid = left + (right - left) // 2

            # Here we make sure mid is even
            if mid % 2 == 1:
                mid -= 1
            
            if nums[mid] == nums[mid + 1]:
                left = mid + 2
            else:
                right = mid
            
        return nums[left]
    
def main():
    sol = SingleElementInSortedArray()
    nums = [1,1,2,3,3,4,4,8,8]
    res = sol.isNonDuplicateElement(nums)
    print(res)

if __name__ == "__main__":
    main()
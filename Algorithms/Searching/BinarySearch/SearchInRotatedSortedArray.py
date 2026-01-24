from typing import List

class SearchInRotatedSortedArray:
    def searchTarget(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = left+ (right - left) // 2

            if nums[mid] == target:
                return mid
            
            # check if the left half is sorted
            if nums[left] <= nums[mid]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1

            # otherwise, the right half is sorted
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return -1

def main():
    sol = SearchInRotatedSortedArray()
    nums = [4,5,6,7,0,1,2]
    target = 0
    res = sol.searchTarget(nums, target)
    print(res)      

if __name__ == "__main__":
    main()
from typing import List

class SearchInRotatedSortedArray2:
    def search(self, nums: List[int], target: int) -> bool:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = left + (right - left) // 2

            if nums[mid] == target:
                return True
            
            # In this problem, we have handle the duplicates
            if nums[left] == nums[mid] == nums[right]:
                left += 1
                right -= 1
                continue

            # Left half sorted
            if nums[left] <= nums[mid]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1

            # Right half sorted
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return False
                
def main():
    sol = SearchInRotatedSortedArray2()
    nums = [2,5,6,0,0,1,2]
    target = 0
    res = sol.search(nums, target)
    print(res)

if __name__ == "__main__":
    main()
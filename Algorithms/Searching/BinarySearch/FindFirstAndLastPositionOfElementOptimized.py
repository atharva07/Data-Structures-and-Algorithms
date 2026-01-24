from typing import List

# this is a Flag method where are using boolean flag to indicate the first and last
# The First element is set as True
# The Last element is set as False

class FindFirstAndLastPositionOfElementOptimized:
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        def binarySearch(findFirst: bool) -> int:
            left = 0
            right = len(nums) - 1
            idx = -1

            while left <= right:
                mid = left + (right - left) // 2

                if nums[mid] == target:
                    idx = mid
                    if findFirst:
                        right = mid - 1  # Keep searching left part
                    else:
                        left = mid + 1 # Keep searching right part
                elif nums[mid] < target: 
                    left = mid + 1
                else:
                    right = mid - 1
            
            return idx
        
        return [binarySearch(True), binarySearch(False)]
    
def main():
    sol = FindFirstAndLastPositionOfElementOptimized()
    nums = [5,7,7,8,8,10]
    target = 8
    res = sol.searchRange(nums, target)
    print(res)

if __name__ == "__main__":
    main()

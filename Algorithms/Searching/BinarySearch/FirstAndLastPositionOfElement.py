from typing import List
# In below solution we are using binary search twice to find the first and last postion of target
# Time Complexity: O(log n)
# Space Complexity: O(1)

class FirstAndLastPositionOfElement:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def findFirst():
            left = 0
            right = len(nums) - 1
            idx = -1

            while left <= right:
                mid = left + (right - left) // 2

                if nums[mid] == target:
                    idx = mid
                    right = mid - 1  # keep searching left part
                elif nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1

            return idx

        def findLast():
            left = 0
            right = len(nums) - 1
            idx = -1

            while left <= right:
                mid = left + (right - left) // 2

                if nums[mid] == target:
                    idx = mid
                    left = mid + 1   # keep searching right part
                elif nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1
            
            return idx
        
        return [findFirst(), findLast()]
    
def main():
    sol = FirstAndLastPositionOfElement()
    nums = [5,7,7,8,8,10]
    target = 8
    res = sol.searchRange(nums, target)
    print(res)

if __name__ == "__main__":
    main()


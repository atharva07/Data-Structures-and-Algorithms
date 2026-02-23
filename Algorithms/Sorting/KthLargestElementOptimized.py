import random
from typing import List

# We are solving this problem using Quick Select algorithm

class KthLargestElementOptimized:

    def findKthLargest(self, nums: List[int], k: int) -> int:
        target = len(nums) - k

        def quickSelect(left, right):
            pivot = nums[random.randint(left, right)]
            l, r = left, right

            while l <= r:
                while nums[l] < pivot:
                    l += 1
                while nums[r] > pivot:
                    r -= 1

                if l <= r:
                    nums[l], nums[r] = nums[r], nums[l]
                    l += 1
                    r -= 1
            
            if target <= r:
                return quickSelect(left, r)
            if target >= l:
                return quickSelect(l, right)
            
            return nums[target]
        
        return quickSelect(0, len(nums) - 1)
    
def main():
    sol = KthLargestElementOptimized()
    words = [3,2,1,5,6,4]
    k = 2
    res = sol.findKthLargest(words, k)
    print(res)

if __name__ == "__main__":
    main()
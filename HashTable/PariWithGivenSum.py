from typing import List

class PairWithGivenSum:
    # Time Complexity - O(N^2)
    def pairSum(self, nums: List[int], target: int) -> bool:
        n = len(nums)

        for i in range(n):
            for j in range(i+1, n):
                if nums[i] + nums[j] == target:
                    return True
                
        return False
    
    # Time Complexity - O(N)
    def pairSumOptimized(self, nums: List[int], target: int) -> bool:
        seen = set()

        for num in nums:
            remaining = target - num

            if remaining in seen:
                return True
            
            seen.add(num)
        
        return False
    
def main():
    sol = PairWithGivenSum()
    nums = [2,7,11,15]
    target = 9
    res = sol.pairSumOptimized(nums, target)
    print(res)

if __name__ == "__main__":
    main()

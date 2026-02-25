from typing import List

class MinimumDiffHighestLowest:

    def minimumDifference(self, nums: List[int], k: int) -> int:
        if k == 1:
            return 0
        
        sorted_nums = sorted(nums)

        min_diff = float('inf')
        n = len(sorted_nums)

        for i in range(n-k+1):
            diff = sorted_nums[i+k-1] - sorted_nums[i]
            min_diff = min(min_diff, diff)

        return min_diff
    
def main():
    nums = [9,4,1,7]
    k = 2
    sol = MinimumDiffHighestLowest()
    res = sol.minimumDifference(nums, k)
    print(res)

if __name__ == "__main__":
    main()

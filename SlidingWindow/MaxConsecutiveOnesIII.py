from typing import List

class MaxConsecutiveOnes3:

    def longestOnesBrute(self, nums: List[int], k: int) -> int:
        n = len(nums)
        max_len = 0

        for i in range(n):
            zero_count = 0

            for j in range(i,n):
                if nums[j] == 0:
                    zero_count += 1
                
                if zero_count > k:
                    break
                
                max_len = max(max_len, j - i + 1)
        
        return max_len
    
    # Optimal Approach
    def longestOnesOptimal(self, nums: List[int], k: int) -> int:
        left = 0
        zero_count = 0
        max_len = 0

        for right in range(len(nums)):
            if nums[right] == 0:
                zero_count += 1

            while zero_count > k:
                if nums[left] == 0:
                    zero_count -= 1
                left += 1

            max_len = max(max_len, right - left + 1)

        return max_len

def main():
    sol = MaxConsecutiveOnes3()
    nums = [1,1,1,0,0,0,1,1,1,1,0]
    k = 2
    res = sol.longestOnesBrute(nums, k)
    print(res)

if __name__ == "__main__":
    main()
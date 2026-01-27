from typing import List

class LongestIncreasingSubsequence:
    def lengthOfLIS(self, nums: List[int]) -> int:
        tails = []
        # The tail array doesn't necessarily store an actual subsequence, but it maintains the minimum possible tail values for increasing 
        # subsequence of different lengths

        for x in nums:
            left = 0
            right = len(tails) - 1
            pos = len(tails) # default position to insert

            while left <= right:
                mid = left + (right - left) // 2

                if tails[mid] >= x:
                    pos = mid
                    right = mid - 1
                else:
                    left = mid + 1

            if pos == len(tails):
                tails.append(x)
            else:
                tails[pos] = x
        
        return len(tails)
    
def main():
    sol = LongestIncreasingSubsequence()
    nums = [10,9,2,5,3,7,101,18]
    res = sol.lengthOfLIS(nums)
    print(res)

if __name__ == "__main__":
    main()
            

                

        
        
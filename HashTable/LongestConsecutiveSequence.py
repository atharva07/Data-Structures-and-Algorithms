from typing import List

class LongestConsecutiveSequence:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums_set = set(nums)
        longest = 0

        for num in nums_set:
            if num - 1 not in nums_set:
                length = 1
                current = num
                while current + 1 in nums_set:
                    length += 1
                    current += 1
                longest = max(longest, length)

        return longest
    
def main():
    sol = LongestConsecutiveSequence()
    nums = [0,3,7,2,5,8,4,6,0,1]
    res = sol.longestConsecutive(nums)
    print(res)

if __name__ == "__main__":
    main()
        
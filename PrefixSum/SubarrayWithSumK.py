from typing import List

class SubarrayWithSumK:
    def longestSubArrayWithSumK(self, nums: List[int], k: int) -> int:
        # Dictionary to store the prefix sum and their frequencies
        prefix_count = {}
        prefix_count[0] = 1
        current_sum = 0
        count = 0

        for num in nums:
            current_sum += num

            # Check if (current_sum - k) exists in the dictionary
            if (current_sum - k) in prefix_count:
                count += prefix_count[current_sum - k]

            # Update the frequency of current prefix sum
            if current_sum in prefix_count:
                prefix_count[current_sum] += 1
            else:
                prefix_count[current_sum] = 1
        
        return count
    
def main():
    sol = SubarrayWithSumK()
    nums = [1,1,1]
    k = 2
    res = sol.longestSubArrayWithSumK(nums, k)
    print(res)

if __name__ == "__main__":
    main()
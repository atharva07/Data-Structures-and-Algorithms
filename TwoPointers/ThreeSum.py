from typing import List

class ThreeSum:

    def threeSumProblem(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []

        for i in range(len(nums) - 2):
            # Skip duplicates for first element
            if i > 0 and nums[i] == nums[i-1]:
                continue

            left = i + 1
            right = len(nums) - 1

            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]

                if current_sum == 0:
                    # Found a valid triplet
                    result.append([nums[i], nums[left], nums[right]])

                    # skip the duplicate for left pointer
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1

                    # Skip duplicate for right pointer
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    # move both pointers
                    left += 1
                    right -= 1

                elif current_sum < 0:
                    left += 1

                else:
                    right -= 1
        
        return result
    
def main():
    sol = ThreeSum()
    nums = [-1, 0, 1, 2, -1, -4]

    result = sol.threeSumProblem(nums)
    print(result)

if __name__ == "__main__":
    main()
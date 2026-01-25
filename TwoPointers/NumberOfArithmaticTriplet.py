from typing import List
class NumberOfArithmaticTriplet:
    def arithmaticTriplets(self, nums: List[int], diff: int) -> int:
        n = len(nums)
        count = 0

        # High level approach
        # Fix the middle pointer j
        # look to left to find i such that nums[j] - nums[i] == diff
        # look to right to find k such that nums[k] - nums[j] == diff
        # If both found increment count, this will be one triplet

        for j in range(1, n-1):
            i = j - 1 # left pointer in triplet
            k = j + 1 # right pointer in triplet

            found_i = False
            while i >= 0:
                if nums[j] - nums[i] == diff:
                    found_i = True
                    break
                elif nums[j] - nums[i] > diff:
                    break
                i -= 1

            if not found_i:
                continue # No point in checking right side if the left side failed

            while k < n: 
                if nums[k] - nums[j] == diff:
                    count += 1
                    break
                elif nums[k] - nums[j] > diff:
                    break
                k += 1

        return count

def main():
    sol = NumberOfArithmaticTriplet()
    nums = [0,1,4,6,7,10]
    k = 3
    res = sol.arithmaticTriplets(nums, k)
    print(res)

if __name__ == "__main__":
    main()
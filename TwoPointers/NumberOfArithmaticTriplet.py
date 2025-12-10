from typing import List
class NumberOfArithmaticTriplet:
    def arithmaticTriplets(self, nums: List[int], diff: int) -> int:
        n = len(nums)
        count = 0

        for j in range(1, n-1):
            i = j - 1
            k = j + 1

            found_i = False
            while i >= 0:
                if nums[j] - nums[i] == diff:
                    found_i = True
                    break
                elif nums[j] - nums[i] > diff:
                    break
                i -= 1

            if not found_i:
                continue

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

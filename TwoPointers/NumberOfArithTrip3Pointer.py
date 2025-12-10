class NumberOfArithTrip3Pointer:
    def numberOfArithmeticTriplets(self, nums: List[int], diff: int) -> int:
        n = len(nums)
        count = 0

        i = 0
        for j in range(1, n-1):
            while i < j and nums[j] - nums[i] > diff:
                i += 1

            if nums[j] - nums[i] != diff:
                continue

            k = j + 1
            while k < n and nums[k] - nums[j] < diff:
                k += 1

            if k < n and nums[k] - nums[j] == diff:
                count += 1

        return count 
    
from typing import List

def main():
    sol = NumberOfArithTrip3Pointer()
    nums = [0,1,4,6,7,10]
    k = 3
    res = sol.numberOfArithmeticTriplets(nums, k)
    print(res)

if __name__ == "__main__":
    main()
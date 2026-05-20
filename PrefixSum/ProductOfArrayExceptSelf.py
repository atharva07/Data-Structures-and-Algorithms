from typing import List

class ProductOfArrayExceptSelf:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n

        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]

        suffix = 1
        for i in range(n-1, -1, -1):
            result[i] = suffix
            suffix *= nums[i]

        return result
    
def main():
    sol = ProductOfArrayExceptSelf()
    nums = [1,2,4,6]
    res = sol.productExceptSelf(nums)
    print(res)

if __name__ == "__main__":
    main()

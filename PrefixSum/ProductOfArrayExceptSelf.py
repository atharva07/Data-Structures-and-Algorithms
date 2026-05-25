from typing import List

class ProductOfArrayExceptSelf:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n

        # Calculate the product of all elements to the left of i
        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]

        # Calculate the product of all elements to the right of i
        # Here we go from right to left to calculate the suffix product and multiple it with the prefix product
        suffix = 1
        for i in range(n-1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]

        return result
    
def main():
    sol = ProductOfArrayExceptSelf()
    nums = [1,2,3,4]
    res = sol.productExceptSelf(nums)
    print(res)

if __name__ == "__main__":
    main()
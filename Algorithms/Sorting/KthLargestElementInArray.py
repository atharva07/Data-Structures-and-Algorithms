from typing import List

class KthLargestElementInArray:

    def findKthLargest(self, nums: List[int], k: int) -> int:
        n = len(nums)

        for i in range(n):
            for j in range(0, n - i - 1):
                if nums[j] < nums[j + 1]:
                    nums[j], nums[j+1] = nums[j+1], nums[j]

        return nums[k-1]
    
def main():
    sol = KthLargestElementInArray()
    words = [3,2,1,5,6,4]
    k = 2
    res = sol.findKthLargest(words, k)
    print(res)

if __name__ == "__main__":
    main()



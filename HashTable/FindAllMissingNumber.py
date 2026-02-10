from typing import List

class FindAllMissingNumber:

    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        num_count = {}

        for num in nums:
            num_count[num] = num_count.get(num, 0) + 1

        result = []
        for i in range(1, n+1):
            if i not in num_count:
                result.append(i)

        return result
    
def main():
    sol = FindAllMissingNumber()
    #nums = [4,3,2,7,8,2,3,1]
    nums = [1,1]
    res = sol.findDisappearedNumbers(nums)
    print(res)

if __name__ == "__main__":
    main()


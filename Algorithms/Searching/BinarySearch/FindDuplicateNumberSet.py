from typing import List

class FindDuplicateNumber:
    def findDuplicate(self, nums: List[int]) -> int:
        seen = set()

        for num in nums:
            if num in seen:
                return num
            seen.add(num)

def main():
    sol = FindDuplicateNumber()
    arr = [1, 3, 4, 2, 2]
    res = sol.findDuplicate(arr)
    print(res)

if __name__ == "__main__":
    main()
from typing import List

class ContainsDuplicate2:

    def containsDuplicate(self, nums: List[int], k: int) -> bool:
        index_map = {}

        for i, num in enumerate(nums):
            if num in index_map:
                if i - index_map[num] <= k:
                    return True
            
            index_map[num] = i

        return False
    
def main():
    sol = ContainsDuplicate2()
    nums = [1,2,3,1,2,3]
    k = 2
    res = sol.containsDuplicate(nums, k)
    print(res)

if __name__ == "__main__":
    main()
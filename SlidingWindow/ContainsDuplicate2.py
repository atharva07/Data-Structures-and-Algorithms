from typing import List
class ContainsDuplicate2:
    def containsDuplicate(self, nums: List[int], k: int) -> bool:
        nums_set = set()
        left = 0

        for right in range(len(nums)):
            if right - left > k:
                nums_set.remove(nums[left])
                left += 1

            if nums[right] in nums_set:
                return True

            nums_set.add(nums[right])

        return False

def main():
    sol = ContainsDuplicate2()
    nums = [1,2,3,1,2,3]
    k = 2
    res = sol.containsDuplicate(nums, k)
    print(res)

if __name__ == "__main__":
    main()
    

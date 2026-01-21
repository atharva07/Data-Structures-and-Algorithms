from typing import List
class FindDuplicateNumber:
    def findDuplicate(self, nums: List[int]) -> int:
        left = 1
        right = len(nums) - 1

        while left < right:
            mid = (left + right) // 2
            count = sum(1 for x in nums if x <= mid)

            if count > mid:
                right = mid
            else:
                left = mid + 1

        return left
from typing import List
from functools import cmp_to_key
# Here we are using custom comparator

class LargestNumber:

    def largestNumber(self, nums: List[int]) -> str:
        # convert to string first
        nums = list(map(str, nums))

        def compare(x, y):
            if x + y > y + x:
                return -1
            elif x + y < y + x:
                return 1
            else:
                return 0
            
        # sort using custom comparator
        nums.sort(key=cmp_to_key(compare))

        if nums[0] == "0":
            return "0"
        
        return "".join(nums)
    
def main():
    sol = LargestNumber()
    nums = [10,2]
    res = sol.largestNumber(nums)
    print(res)

if __name__ == "__main__":
    main()
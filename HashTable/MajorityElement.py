from typing import List

class MajorityElement:
    def majorityElement(self, nums: List[int]) -> int:
        freq_count = {}

        for num in nums:
            if num in freq_count:
                freq_count[num] += 1
            else:
                freq_count[num] = 1

        for num in nums:
            if freq_count[num] > len(nums) / 2:
                return num

        return -1
    
def main():
    sol = MajorityElement()
    nums = [2,2,1,1,1,2,2]
    res = sol.majorityElement(nums)
    print(res)

if __name__ == "__main__":
    main()
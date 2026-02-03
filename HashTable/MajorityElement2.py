from typing import List

class MajorityElement2:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq_count = {}

        for num in nums:
            if num in freq_count:
                freq_count[num] += 1
            else:
                freq_count[num] = 1

        result = []

        for num in freq_count:
            if freq_count[num] > len(nums) / 2:
                result.append(num)

        return result

def main():
    sol = MajorityElement2()
    nums = [3,2,3]
    res = sol.majorityElement(nums)
    print(res)

if __name__ == "__main__":
    main()
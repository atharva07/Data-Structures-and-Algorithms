from typing import List

class SingleNumber:
    
    def singleNumber(self, nums: List[int]) -> int:
        count_freq = {}

        for num in nums:
            count_freq[num] = count_freq.get(num, 0) + 1

        for num, count in count_freq.items():
            if count == 1:
                return num

def main():
    sol = SingleNumber()
    nums = [4,1,2,1,2]
    res = sol.singleNumber(nums)
    print(res)

if __name__ == "__main__":
    main()        
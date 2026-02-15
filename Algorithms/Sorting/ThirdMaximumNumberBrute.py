from typing import List

class ThirdMaximumNumberBrute:
    def thirdMax(self, nums: List[int]) -> int:
        unique_nums = list(set(nums))
        n = len(unique_nums)

        for i in range(n):
            max_index = i
            
            for j in range(i+1, n):
                if unique_nums[j] > unique_nums[max_index]:
                    max_index = j

            # swap the elements
            unique_nums[i], unique_nums[max_index] = unique_nums[max_index], unique_nums[i]
        
        print(unique_nums)

        if len(unique_nums) >= 3:
            return unique_nums[2]
        else:
            return unique_nums[0]
        
def main():
    sol = ThirdMaximumNumberBrute()
    nums = [1,2,2,5,3,5]
    res = sol.thirdMax(nums)
    print("third maximum number is:", res)

if __name__ == "__main__":
    main()


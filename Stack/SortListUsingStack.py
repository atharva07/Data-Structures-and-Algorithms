from typing import List

class SortListUsingStack:
    def sortList(self, nums: List[int]) -> List[int]:
        s = nums[:]
        temp = []

        while s:
            x = s.pop()
            while temp and temp[-1] > x:
                s.append(temp.pop())

            temp.append(x)
        return temp
    
def main():
    sol = SortListUsingStack()
    nums = [1, 5, 4, 2, 3, 6, 8, 7]
    res = sol.sortList(nums)
    print(res)

if __name__ == "__main__":
    main()
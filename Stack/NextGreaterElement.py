from typing import List

class NextGreaterElement:

    def greaterElement(self, nums: List[int]) -> List[int]:
        n = len(nums)
        stack = []
        result = [-1] * n

        for i in range(n):
            while stack and nums[i] > nums[stack[-1]]:
                index = stack.pop()
                result[index] = nums[i]

            stack.append(i)

        return result

def main():
    solver = NextGreaterElement()
    arr = [4, 5, 2, 10]
    res = solver.greaterElement(arr)
    print(res)

if __name__ == "__main__":
    main()
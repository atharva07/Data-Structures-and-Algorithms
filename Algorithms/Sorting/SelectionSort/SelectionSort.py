from typing import List

class SelectionSort:

    def selectionsort(self, nums: List[int]) -> List[int]:
        n = len(nums)

        for i in range(n):
            max_index = i
            for j in range(i+1, n):
                if nums[j] < nums[max_index]:
                    max_index = j
            
            nums[i], nums[max_index] = nums[max_index], nums[i]

        return nums
    
def main():
    sol = SelectionSort()
    arr = [64, 34, 25, 12, 22, 11, 90]
    sorted_arr = sol.selectionsort(arr)
    print("Sorted array is:", sorted_arr)

if __name__ == "__main__":
    main()
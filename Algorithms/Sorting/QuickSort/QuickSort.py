from typing import List

class QuickSort:
    def partition(self, nums: List[int], low: int, high: int) -> int:
        pivot = nums[low]
        i = low
        j = high

        while i < j:
            while nums[i] <= pivot and i <= high:
                i += 1

            while nums[j] > pivot and j >= low:
                j -= 1

            if i < j:
                nums[i], nums[j] = nums[j], nums[i]
        
        nums[low], nums[j] = nums[j], nums[low]
        return j
    
    def quickSortHelper(self, nums: List[int], low: int, high: int) -> None:
        if low < high:
            pivot = self.partition(nums, low, high)
            self.quickSortHelper(nums, low, pivot - 1)
            self.quickSortHelper(nums, pivot + 1, high)

    def quickSort(self, nums: List[int]) -> List[int]:
        self.quickSortHelper(nums, 0, len(nums) - 1)
        return nums
    
def main():
    sol = QuickSort()
    arr = [64, 34, 25, 12, 22, 11, 90]
    sorted_arr = sol.quickSort(arr)
    print("Sorted array is:", sorted_arr)

if __name__ == "__main__":
    main()
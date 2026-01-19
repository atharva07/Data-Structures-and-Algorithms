from typing import List

class BinarySearchIterative:
    def binary_search_iterative(self, arr: List[int], target: int) -> int:
        left, right = 0, len(arr) - 1

        while left <= right: # Loop until pointers meet
            mid = left + (right - left) // 2

            # Check if the mid point is target
            if arr[mid] == target:
                return mid   # Target found, return index
            elif arr[mid] < target:
                left = mid + 1 # Adjust the left pointer and move towards right
            else:
                right = mid - 1   # Adjust the right pointer and move towards left
            
        return -1
    
def main():
    sol = BinarySearchIterative()
    arr = [3, 6, 8, 12, 14, 19, 24, 30, 35, 42]
    target = 19
    res = sol.binary_search_iterative(arr, target)
    print(res)

if __name__ == "__main__":
    main()
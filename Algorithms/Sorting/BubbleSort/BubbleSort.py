from typing import List

# Time complextity: O(n^2)
# Space complexity: O(1)
class BubbleSort:
    def bubblesort(self, arr: List[int]) -> List[int]:
        n = len(arr)

        for i in range(n):
            for j in range(0, n-i-1):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]

        return arr
    
def main():
    sol = BubbleSort()
    arr = [64, 34, 25, 12, 22, 11, 90]
    sorted_arr = sol.bubblesort(arr)
    print("Sorted array is:", sorted_arr)

if __name__ == "__main__":
    main()
from typing import List

# Time complexity: O(n log n)
# Space complexity: O(n)
class MergeSort:

    def merge(self, left: int, right: int) -> List[int]:
        merged = []
        i = j = 0

        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                merged.append(left[i])
                i += 1
            else:
                merged.append(right[j])
                j += 1

        merged.extend(left[i:])
        merged.extend(right[j:])

        return merged
    
    def mergeSort(self, arr: List[int]) -> List[int]:
        if len(arr) <= 1:
            return arr
    
        mid = len(arr) // 2
        left_half = self.mergeSort(arr[:mid])
        right_half = self.mergeSort(arr[mid:])
        return self.merge(left_half, right_half)
    
def main():
    sol = MergeSort()
    arr = [38, 27, 43, 3, 9, 82, 10]
    sorted_arr = sol.mergeSort(arr)
    print(sorted_arr)

if __name__ == "__main__":
    main()
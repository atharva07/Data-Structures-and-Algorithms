from rpds import List

class TwoSumUsingBinarySearch:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        n = len(numbers)

        for i in range(n):
            left = i + 1
            right = n - 1
            needed = target - numbers[i]

            while left <= right:
                mid = (left + right) // 2

                if numbers[mid] == needed:
                    return [i+1, mid+1]
                elif numbers[mid] < needed:
                    left = mid + 1
                else:
                    right = mid - 1
                
def main():
    sol = TwoSumUsingBinarySearch()
    arr = [2,7,11,15]
    target = 9
    res = sol.twoSum(arr, target)
    print(res)

if __name__ == "__main__":
    main()
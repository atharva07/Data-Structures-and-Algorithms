from typing import List

class SmallestLetterGreaterThanTarget:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        left = 0
        right = len(letters) - 1
        result = None

        while left <= right:
            mid = left + (right - left) // 2

            if letters[mid] <= target:
                left = mid + 1
            else:
                right = mid - 1
                result = letters[mid]

        return result if result is not None else letters[0]
    
def main():
    sol = SmallestLetterGreaterThanTarget()
    letters = ["c", "f", "j"]
    target = "z"
    res = sol.nextGreatestLetter(letters, target)
    print(res)

if __name__ == "__main__":  
    main()


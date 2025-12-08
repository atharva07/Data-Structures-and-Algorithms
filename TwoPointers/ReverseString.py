from typing import List

class Solution: 
    def reverseString(self, string: List[str]) -> None:
        left = 0
        right = len(string) - 1

        while left < right:
            string[left], string[right] = string[right], string[left]
            left += 1
            right -= 1
        
        return string
    
def main():
    sol = Solution()
    string = ["h", "e", "l", "l", "o"]
    rev_string = sol.reverseString(string)
    print(rev_string)

if __name__ == "__main__":
    main()
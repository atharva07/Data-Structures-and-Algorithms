class Solution:
    def isPalindrome(self, string: str) -> bool:
        cleaned = ''.join(filter(str.isalnum, string)).lower()

        left = 0
        right = len(cleaned) - 1

        while left < right:
            if cleaned[left] != cleaned[right]:
                return False
    
            left += 1
            right -= 1

        return True

def main():
    sol = Solution()

    result = sol.isPalindrome("A man, a plan, a canal: Panama")
    print(result)

if __name__ == "__main__":
    main()
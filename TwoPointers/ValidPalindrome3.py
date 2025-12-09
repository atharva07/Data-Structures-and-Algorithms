class ValidPalindrome:

    def validPalindrome(self, s: str) -> bool:
        def is_palindrome(i: int, j: int) -> bool:
            while i < j:
                if s[i] != s[j]:
                    return False
                i += 1
                j -= 1
            return True
        
        left, right = 0, len(s) - 1

        while left < right:
            if s[left] != s[right]:
                # Try Deleting one character (left or right)
                return (is_palindrome(left+1, right) or 
                        is_palindrome(left, right-1))
            left += 1
            right -= 1

        return True
    
def main():
    sol = ValidPalindrome()
    s = "aba"
    res = sol.validPalindrome(s)
    print(res)

if __name__ == "__main__":
    main()
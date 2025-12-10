class LongestPalindromeSubstring:
    
    def longestPalindrome(self, s: str) -> str:
        def expandAroundCenter(left: int, right: int) -> str:
            # Expand as long as characters match within bounds
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1

            # return the palindrome from left+1 to right-1
            return s[left + 1: right]
        
        if not s:
            return ""
        
        longest = ""

        for i in range(len(s)):

            # Odd length palindrome -> center at i
            odd_palindrome = expandAroundCenter(i,i)
            # Even length palindrome -> center between i and i+1
            even_palindrome = expandAroundCenter(i, i+1)

            # update longest palindrome string
            if len(odd_palindrome) > len(longest):
                longest = odd_palindrome
            if len(even_palindrome) > len(longest):
                longest = even_palindrome

        return longest
    
def main():
    sol = LongestPalindromeSubstring()
    s = "babad"
    res = sol.longestPalindrome(s)
    print(res)

if __name__ == "__main__":
    main()
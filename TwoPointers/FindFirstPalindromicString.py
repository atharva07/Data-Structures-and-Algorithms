from typing import List

class FindFirstPalindromicString:

    def firstPalindromicString(self, words: List[str]) -> str:
        
        def isPalindromic(word: str):
            left = 0
            right = len(word) - 1

            while left < right:
                if word[left] != word[right]:
                    return False
                left += 1
                right -= 1
            return True
        
        for word in words:
            res = isPalindromic(word)
            if res:
                return word
            
        return ""

            
def main():
    sol = FindFirstPalindromicString()
    words = ["def","ghi"]
    res = sol.firstPalindromicString(words
    print(res)

if __name__ == "__main__":
    main()

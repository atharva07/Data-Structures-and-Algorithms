class LongestSubstringWithoutDuplicate:
    
    # Complexity - O(n^2)
    def lengthOfLongestSubstringBrute(self, s: str) -> int:
        n = len(s)
        max_len = 0

        for i in range(n):
            seen = set()

            for j in range(i, n):
                if s[j] in seen:
                    break
                
                seen.add(s[j])
                max_len = max(max_len, j - i + 1)

        return max_len

    # Complexity - O(n)
    def lengthOfLongestSubstringOptimized(self, s: str) -> int:
        char_set = set()
        left = 0
        max_len = 0

        for right in range(len(s)):
            while s[right] in char_set:
                char_set.remove(s[left])
                left += 1

            char_set.add(s[right])
            max_len = max(max_len, right - left + 1)

        return max_len
    
def main():
    sol = LongestSubstringWithoutDuplicate()
    s = "abcabccbb"
    res = sol.lengthOfLongestSubstring(s)
    print(res)

if __name__ == "__main__":
    main()
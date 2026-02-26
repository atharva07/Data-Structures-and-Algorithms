class LongestRepeatingCharacterReplacement:
    # Brute Force Approach - O(n^2)
    def characterReplacement(self, s: str, k: int) -> int:
        n = len(s)
        max_len = 0

        for i in range(n):
            freq = {}

            for j in range(i, n):
                freq[s[j]] = freq.get(s[j], 0) + 1

                max_freq = max(freq.values())
                window_size = j - i + 1

                replacements_needed = window_size - max_freq

                if replacements_needed <= k:
                    max_len = max(max_len, window_size)

        return max_len
    
    # Optimal Approach - O(n)
    def characterReplacementOptimal(self, s: str, k: int) -> int:
        left = 0
        max_len = 0
        char_count = {}
        max_freq = 0

        for right in range(len(s)):
            char = s[right]
            char_count[char] = char_count.get(char, 0) + 1

            max_freq = max(max_freq, char_count[char])
            window_size = right - left + 1
            replacement_needed = window_size - max_freq

            if replacement_needed > k:
                char_count[s[left]] -= 1
                left += 1

            max_len = max(max_len, right - left + 1)
        
        return max_len
            
def main():
    s = "AABABBA"
    k = 1
    sol = LongestRepeatingCharacterReplacement()
    res = sol.characterReplacementOptimal(s, k)
    print(res)

if __name__ == "__main__":
    main()
                
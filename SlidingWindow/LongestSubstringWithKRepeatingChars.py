class LongestSubstringWithKRepeatingChars:

    # complexity -> O(n^3)
    def longestSubstringBrute(self, s: str, k: int) -> int:
        n = len(s)
        max_len = 0

        for i in range(n):
            seen = {}

            for j in range(i, n):
                char = s[j]
                seen[char] = seen.get(char, 0) + 1

                # check validity
                valid = True
                for count in seen.values():
                    if count < k:
                        valid = False
                        break

                if valid:
                    max_len = max(max_len, j - i + 1)

        return max_len
    
    def longestSubStringOptimized(self, s: str, k: int) -> int:
        pass

def main():
    sol = LongestSubstringWithKRepeatingChars()
    s = "aaabb"
    k = 3
    res = sol.longestSubstringBrute(s, k)
    print(res)

if __name__ == "__main__":
    main()
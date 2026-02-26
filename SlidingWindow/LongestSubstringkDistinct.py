class LongestSubstringKDistinct:

    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:
        n = len(s)
        max_len = 0

        for i in range(n):
            seen = set()

            for j in range(i, n):
                seen.add(s[j])

                if len(seen) > k:
                    break
                max_len = max(max_len, j - i + 1)
        
        return max_len

def main():
    sol = LongestSubstringKDistinct()
    s = "eceba"
    k = 2
    res = sol.lengthOfLongestSubstringKDistinct(s, k)
    print(res)

if __name__ == "__main__":
    main()

class Solution:

    def __init__(self):
        pass

    def reverseSubString(self, chars, left, right):
        while left < right:
            chars[left], chars[right] = chars[right], chars[left]
            left += 1
            right -= 1

    def reverseString2(self, s: str, k: int) -> str:
        chars = list(s)
        n = len(s)

        for i in range(0, n, 2 * k):
            left = i
            right = min(i+k-1, n-1)

            self.reverseSubString(chars, left, right)

        return ''.join(chars)

def main():
    sol = Solution()
    string = "abcdef"
    k = 2

    result = sol.reverseString2(string, k)
    print(result)

if __name__ == "__main__":
    main()
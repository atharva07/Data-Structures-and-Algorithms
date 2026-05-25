class Solution:
    def reverseString3(self, string, k):
        n = len(string)
        result = ""

        for i in range(0, n, k):
            group = string[i:i+k]
            result += group[::-1]

        return result

def main():
    sol = Solution()
    string = "abcdef"
    k = 2

    result = sol.reverseString3(string, k)
    print(result)

if __name__ == "__main__":
    main()
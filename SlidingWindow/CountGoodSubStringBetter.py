class CountGoodSubStringBetter:
    def countGoodSubstring(self, s: str) -> int:
        count = 0

        for i in range(len(s) - 2):
            a, b, c = s[i], s[i+1], s[i+2]

            if a != b and a != c and b != c:
                count += 1

        return count
    
def main():
    sol = CountGoodSubStringBetter()
    s = "xyzzaz"
    res = sol.countGoodSubstring(s)
    print(res)

if __name__ == "__main__":
    main()
class FindTheDifference:

    def findTheDiffernence(self, s: str, t: str) -> str:
        count_s = {}
        count_t = {}

        for char in s:
            count_s[char] = count_s.get(char, 0) + 1

        for char in t:
            count_t[char] = count_t.get(char, 0) + 1

        for char in count_t.keys():
            if count_t[char] != count_s.get(char, 0):
                return char
            
        return ""
    
def main():
    sol = FindTheDifference()
    s = "abcd"
    t = "abcde"
    res = sol.findTheDiffernence(s, t)
    print(res)

if __name__ == "__main__":
    main()
    

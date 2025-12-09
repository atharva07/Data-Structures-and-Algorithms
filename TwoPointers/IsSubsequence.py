class IsSubsequence:

    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0

        while i < len(s) and j < len(t):
            if s[i] == t[j]:
                i+= 1
            j += 1
        
        return i == len(s)

def main():
    sol = IsSubsequence()
    t = "ahbgdc"
    s = "abc"
    res = sol.isSubsequence(s, t)
    print(res)

if __name__ == "__main__":
    main()
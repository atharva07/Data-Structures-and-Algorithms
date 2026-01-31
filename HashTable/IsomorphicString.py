class IsomorphicString:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        dict1 = dict()
        dict2 = dict()

        for ch_s, ch_t in zip(s,t):

            if ch_s in dict1:
                if dict1[ch_s] != ch_t:
                    return False
            else:
                dict1[ch_s] = ch_t

            if ch_t in dict2:
                if dict2[ch_t] != ch_s:
                    return False
            else:
                dict2[ch_t] = ch_s

        return True
    
def main():
    sol = IsomorphicString()
    s = "egg"
    t = "add"
    res = sol.isIsomorphic(s, t)
    print(res)

if __name__ == "__main__":
    main()
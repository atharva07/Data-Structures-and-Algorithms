class ValidAnagram:
    def isAnagram(self, s: str, t: str) -> bool:
        s1 = sorted(s)
        t1 = sorted(t)

        return s1 == t1

def main():
    s = "anagram"
    t = "nagaram"

    obj = ValidAnagram()
    print(obj.isAnagram(s, t))

if __name__ == "__main__":
    main()
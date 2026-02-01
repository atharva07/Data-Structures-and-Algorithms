class ValidAnagramOptimized:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        char_count_1 = {}
        for char in s:
            char_count_1[char] = char_count_1.get(char, 0) + 1

        char_count_2 = {}
        for char in t:
            char_count_2[char] = char_count_2.get(char, 0) + 1

        if char_count_1 != char_count_2:
            return False
        
        return True
    
def main():
    s = "anagram"
    t = "nagaram"

    obj = ValidAnagramOptimized()
    print(obj.isAnagram(s, t))

if __name__ == "__main__":
    main()
class FirstUniqueCharacterInString:
    def firstUniqChar(self, s: str) -> int:
        char_count = {}

        for char in s:
            char_count[char] = char_count.get(char, 0) + 1

        for char, count in char_count.items():
            if count == 1:
                return s.index(char)
            
        return -1
    
def main():
    sol = FirstUniqueCharacterInString()
    s = "leetcode"
    res = sol.firstUniqChar(s)
    print(res)

if __name__ == "__main__":
    main() 
    
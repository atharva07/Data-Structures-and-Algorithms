class WordPattern:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False
        
        # this dict ensures one char maps to one word
        char_to_word = {}
        # this dict ensures one word maps to one char
        word_to_char = {}

        for char, word in zip(pattern, words):
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False    
            else:
                char_to_word[char] = word
            
            if word in word_to_char:
                if word_to_char[word] != char:
                    return False
            else:
                word_to_char[word] = char
        
        return True

def main():
    sol = WordPattern()
    pattern = "abba"
    s = "dog cat cat dog"
    res = sol.wordPattern(pattern, s)
    print(res)

if __name__ == "__main__":
    main()
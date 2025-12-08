class ReverseWordsInString:

    def reverseWords(self, s: str) -> str:
        words = s.split(' ')
        print(words)
        rev_words = []

        for word in words:
            chars = list(word)
            left = 0
            right = len(chars) - 1

            while left < right:
                chars[left], chars[right] = chars[right], chars[left]
                left += 1
                right -= 1
            
            revWord = ''.join(chars)
            rev_words.append(revWord)
        
        return ' '.join(rev_words)
    
def main():
    sol = ReverseWordsInString()
    string = "Let's take LeetCode contest"
    rev_string = sol.reverseWords(string)
    print(rev_string)

if __name__ == "__main__":
    main()
    

            

            

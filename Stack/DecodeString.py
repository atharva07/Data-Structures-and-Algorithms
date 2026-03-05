class DecodeString:
    def decodeString(self, s: str) -> str:
        stack = []
        num = 0
        current_string = ""

        for char in s:
            if char.isdigit():
                num = num * 10 + int(char)
            elif char == "[":
                stack.append((current_string, num))
                current_string = ""
                num = 0
            elif char == "]":
                prev_string, prev_num = stack.pop()
                current_string = prev_string + prev_num * current_string
            else:
                current_string += char
            
        return current_string
    
def main():
    decode = DecodeString()
    print(decode.decodeString("3[a]2[bc]"))

if __name__ == "__main__":
    main()

            
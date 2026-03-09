from typing import List

class StringCompression:

    def compress(self, chars: List[str]) -> int:
        res = ''.join(chars)

        freq = {}
        for char in res:
            freq[char] = freq.get(char, 0) + 1

        result = []

        for key, value in freq.items():
            result.append(key + str(value))

        return len(''.join(result))
    
def main():
    solver = StringCompression()
    chars = ["a","a","b","b","c","c","c"]
    result = solver.compress(chars)
    print(result)

if __name__ == "__main__":
    main()


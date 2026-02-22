from typing import List

class TopKFrequentWords:

    def topKFrequent(self, words: List[str], k: str) -> List[str]:
        freq = {}

        for word in words:
            freq[word] = freq.get(word, 0) + 1

        # sort the frequency desc, then lexicographically asc
        sorted_words = sorted(freq.items(), key=lambda x: (-x[1], x[0]))

        return [word for word, _ in sorted_words[:k]]
    
def main():
    sol = TopKFrequentWords()
    words = ["the","day","is","sunny","the","the","the","sunny","is","is"]
    k = 4
    res = sol.topKFrequent(words, k)
    print(res)

if __name__ == "__main__":
    main()

from typing import List

class TopKFrequentElements:

    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        #return [num for num, _ in sorted(freq.items(), key = lambda x: -x[1])[:k]]
        items = freq.items() # it gives list of tuples with key and value [(1, 3), (2, 2), (3, 1)]

        sorted_items = sorted(items, key=lambda x: -x[1]) # sorts the list in descending order

        top_k = sorted_items[:k]
        result = []

        for num, _ in top_k:
            result.append(num)

        return result
    
def main():
    sol = TopKFrequentElements()
    nums = [1,1,1,2,2,3]
    k = 4
    res = sol.topKFrequent(nums, k)
    print(res)

if __name__ == "__main__":
    main()
    

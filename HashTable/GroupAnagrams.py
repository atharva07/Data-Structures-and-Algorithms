from typing import List

class GroupAnagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {}

        for s in strs:
            sorted_s = ''.join(sorted(s))
            if sorted_s not in anagram_map:
                anagram_map[sorted_s] = []
            anagram_map[sorted_s].append(s)
        
        return list(anagram_map.values())
    
def main():
    sol = GroupAnagrams()
    strs = ["eat","tea","tan","ate","nat","bat"]
    res = sol.groupAnagrams(strs)
    print(res)

if __name__ == "__main__":
    main()
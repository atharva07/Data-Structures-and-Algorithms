from typing import Counter

class MinimumWindowSubString:
    def minWindow(self, string1: str, string2: str) -> str:
        if not string1 or not string2:
            return ""
        
        string2_count = Counter(string2)
        window_count = {}

        required = len(string2_count)
        formed = 0

        left = 0
        min_left = float("inf")
        result = ""

        for right in range(len(string1)):
            char = string1[right]
            

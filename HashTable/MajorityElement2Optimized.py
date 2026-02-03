from typing import Counter, List

class MajorityElement2Optimized:
    def majorityElement(self, nums: List[int]) -> List[int]:
        element_count = Counter(nums)
        
        majority_elements = []
        threshold = len(nums) // 3

        for element, count in element_count.items():
            if count > threshold:
                majority_elements.append(element)

        return majority_elements

def main():
    sol = MajorityElement2Optimized()
    nums = [3,2,3]
    res = sol.majorityElement(nums)
    print(res)

if __name__ == "__main__":
    main() 
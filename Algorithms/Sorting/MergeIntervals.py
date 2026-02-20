from typing import List

class MergeIntervals:

    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # Sort intervals based on the start time
        # Then traverse the sorted intervals and compare them using next.start <= current.end condition
        # If condition is true, then merge the start of current and end of next and update the current interval
        # If condition is false, then move to next interval and compare

        if len(intervals) <= 1:
            return intervals

        def sortIntervals(intervals):
            n = len(intervals)

            for i in range(n):
                for j in range(0, n - i - 1):
                    if intervals[j][0] > intervals[j+1][0]:
                        intervals[j], intervals[j+1] = intervals[j+1], intervals[j]

            return intervals
        
        sortedIntervals = sortIntervals(intervals)

        merged = []

        current = sortedIntervals[0]

        for i in range(1, len(sortedIntervals)):
            if sortedIntervals[i][0] <= current[1]:
                current[1] = max(current[1], sortedIntervals[i][1])
            else:
                merged.append(current)
                current = sortedIntervals[i]

        merged.append(current)
        
        return merged
    
def main():
    sol = MergeIntervals()
    intervals = [[1,3],[2,6],[8,10],[15,18]]
    result = sol.merge(intervals)
    print(result)

if __name__ == "__main__":
    main()

        
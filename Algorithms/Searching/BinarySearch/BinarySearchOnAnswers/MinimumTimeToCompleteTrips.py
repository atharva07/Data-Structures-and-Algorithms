from typing import List

class MinimumTimeToCompleteTrips:
    def minimumTime(self, time: List[int], totalTrips: int) -> int:
        left = 1
        right = min(time) * totalTrips # maximum possible time

        while left < right:
            mid = (left + right) // 2

            # calculate how many trips can be done in 'mid' time
            trips = 0
            for t in time:
                trips += mid // t

            if trips >= totalTrips:
                # mid time is sufficient, try smaller
                right = mid
            else:
                # mid time is not enough, try larger
                left = mid + 1
            
        return left
    
def main():
    solver = MinimumTimeToCompleteTrips()
    time = [1, 2, 3]
    totalTrips = 5
    result = solver.minimumTime(time, totalTrips)
    print(f"Minimum time to complete {totalTrips} trips: {result}")

if __name__ == "__main__":
    main()
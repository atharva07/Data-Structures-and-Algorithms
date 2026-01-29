import math
from typing import List

class MinimumSpeedToArrive:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
        n = len(dist)
    
        # minimum time needed is n - 1 hours
        if hour <= n - 1:
            return -1
        
        left = 1
        right = 10**7 # setting an upper limit for speed
        answer = -1

        while left <= right:
            mid = (left + right) // 2

            # calculate total time taken with speed 'mid'
            time = 0.0

            for i in range(n):
                time += dist[i] / mid

                # Apply waiting rule for all but the last train
                if i != n - 1:
                    time = math.ceil(time)

            if time <= hour:
                answer = mid
                right = mid - 1 # try smaller speed
            else:
                left = mid + 1 # need larger speed
        
        return answer
    
def main():
    solver = MinimumSpeedToArrive()
    dist = [1, 3, 2]
    hour = 6.0
    result = solver.minSpeedOnTime(dist, hour)
    print(f"Minimum speed to arrive on time: {result}")

if __name__ == "__main__":
    main()
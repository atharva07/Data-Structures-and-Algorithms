class FirstBadVersion:
    def findFirstBadVersion(self, n: int) -> int:
        left = 1
        right = n

        while left < right:
            mid = left + (right - left) // 2

            if isBadVersion(mid):
                right = mid
            else:
                left = mid + 1

        return left
    
# 1 2 3 4 5 6 7
# G G G B B B B


class FirstBadVersion:
    def findFirstBadVersion(self, n: int) -> int:
        if len(n) == 1:
            return 1
        
        left = 1
        right = n

        while left <= right:
            mid = left + (right - left) // 2

            if isBadVersion(mid):
                right = mid
            else:
                left = mid + 1

        return left



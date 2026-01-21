from typing import List

class CountNegativeNumbers:
    def countNegative(self, grid: List[List[int]]) -> int:
        if not grid or not grid[0]:
            return 0
        
        rows = len(grid)
        cols = len(grid[0])
        count = 0
        row = 0
        col = cols - 1

        while row < rows and col >= 0:
            if grid[row][col] < 0:
                count += (rows - row)
                col -= 1
            else:
                row += 1

        return count

def main():
    sol = CountNegativeNumbers()
    grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    res = sol.countNegative(grid)
    print(res)

if __name__ == "__main__":
    main()

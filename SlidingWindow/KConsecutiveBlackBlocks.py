class KConsecutiveBlackBlocks:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        n = len(blocks)
        minOperations = float('inf') # this means positive infinity

        # looping through all possible windows of size k
        for i in range(n - k + 1):
            count = 0
            window = blocks[i:i + k]

            for ch in window:
                if ch == 'W':
                    count += 1

            minOperations = min(minOperations, count)

        return minOperations
    
def main():
    solver = KConsecutiveBlackBlocks()
    blocks = "WBBWWBBWBW"
    k = 7
    result = solver.minimumRecolors(blocks, k)
    print(f"Minimum recolors needed: {result}")

if __name__ == "__main__":
    main()





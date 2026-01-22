class FindKBeautyNumber:
    def divisorSubString(self, num: int, k: int) -> int:
        numstr = str(num)
        count = 0
        n = len(numstr)

        # Sliding window of size k
        for i in range(0, n - k + 1):
            sub_str = numstr[i:i+k]
            divisor = int(sub_str)
            print(f"Divisor : {divisor}")

            # check if the divisor is not zero and divides the number
            if divisor != 0 and num % divisor == 0:
                count += 1

        return count

def main():
    sol = FindKBeautyNumber()
    num = 240
    k = 2
    res = sol.divisorSubString(num, k)
    print(res)      

if __name__ == "__main__":  
    main()
class FindUglyNumber:
    def nthUglyNumber(self, n: int) -> int:
        def isUgly(num):

            for factor in [2,3,5]:
                while num % factor == 0:
                    num //= factor
                
            return num == 1
        
        count = 0
        number = 0
        memo = {}

        while count < n:
            number  += 1

            if number not in memo:
                memo[number] = isUgly(number)

            if memo[number]:
                count += 1

        return number
    
def main():
    sol = FindUglyNumber()
    n = 10
    res = sol.nthUglyNumber(n)
    print(res)

if __name__ == "__main__":
    main()
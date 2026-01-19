class HappyNumber:
    def findHappyNumber(self, n: int) -> bool:
        seen = set()
        
        while n != 1:
            if n in seen:
                return False
            
            seen.add(n)
            digits = []
            sum = 0
            
            while n > 0:
                digits.append(n%10)
                n //= 10

            digits.reverse()

            for num in digits:
                square = num * num
                sum += square

            n = sum
        
        return True
        
def main():
    sol = HappyNumber()
    nums = 2

    result = sol.findHappyNumber(nums)
    print(result)

if __name__ == "__main__":
    main()



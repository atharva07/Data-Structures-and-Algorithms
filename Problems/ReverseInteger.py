class ReverseInteger:
    def reverse(self, x: int) -> int:
        res = 0
        if x >= 0:
            res = int(str(x)[::-1])
        else:
            res = int(str(x)[1:][::-1]) * -1

        if res > 2**31 -1 or res < -2**31:
            return 0
        
        return res
    
def main():
    sol = ReverseInteger()
    x = -123
    res = sol.reverse(x)
    print(res)

if __name__ == "__main__":
    main()
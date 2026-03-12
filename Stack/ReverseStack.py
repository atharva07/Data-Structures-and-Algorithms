class ReverseStack:
    # Using another stack
    def reverseStack(self, stack):
        temp = []

        while stack:
            temp.append(stack.pop())

        return temp
    
def main():
    solver = ReverseStack()
    arr = [1, 2, 3, 4]
    res = solver.reverseStack(arr)
    print(res)

if __name__ == "__main__":
    main()
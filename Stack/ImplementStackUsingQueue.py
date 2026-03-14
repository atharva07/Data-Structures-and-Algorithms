from collections import deque

class ImplementStackUsingQueue:
    def __init__(self):
        self.q1 = deque()
        self.q2 = deque()

    # Append from the back in deque
    def push(self, x: int) -> None:
        self.q1.append(x)

    # popleft - remove from the front
    def pop(self) -> int:
        while len(self.q1) > 1:
            self.q2.append(self.q1.popleft())

        popped = self.q1.popleft()
        
        self.q1, self.q2 = self.q2, self.q1
        return popped

    def top(self) -> int:
        while len(self.q1) > 1:
            self.q2.append(self.q1.popleft())

        top_element = self.q1.popleft()
        self.q2.append(top_element) # We are putting back the top element

        self.q1, self.q2 = self.q2, self.q1
        return top_element

    def empty(self) -> bool:
        return len(self.q1) == 0
    
def main():
    stack = ImplementStackUsingQueue()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    #stack.push(4)

    print("top():", stack.top())   # expected 3
    print("pop():", stack.pop())   # expected 3
    print("top():", stack.top())   # expected 2
    print("pop():", stack.pop())   # expected 2
    print("pop():", stack.pop())   # expected 1
    print("empty():", stack.empty())

if __name__ == "__main__":
    main()
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    
class PalindromeLinkedList:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        stack = []
        temp = head

        # push all the elements to stack
        while temp is not None:
            stack.append(temp.val)
            temp = temp.next

        # Use while loop to check the elements
        while temp is not None:
            if temp.val != stack.pop():
                return False
            temp = temp.next

        return True

def main():
    solver = PalindromeLinkedList()
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(2)
    head.next.next.next = ListNode(1)

    result = solver.isPalindrome(head)

    print(result)

if __name__ == "__main__":
    main()
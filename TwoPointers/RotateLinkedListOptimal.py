# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if not head or not head.next or k == 0:
            return head
        
        # step 1: Find Length
        length = 0
        curr = head
        while curr:
            length += 1
            curr = curr.next

        # step 2: Normalize k
        k = k % length
        if k == 0:
            return head
        
        # step 3: Two Pointers
        slow = head
        fast = head

        # Move fast k steps ahead
        for _ in range(k):
            fast = fast.next

        # Move both until fast is last node
        while fast.next:
            slow = slow.next
            fast = fast.next

        # step 4: Rewire Pointer
        new_head = slow.next
        slow.next = None
        fast.next = head

        return new_head
    
# ------------------------
# Helper functions for testing
# ------------------------

def build_linked_list(values):
    """Convert a Python list to a linked list"""
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next

    return head


def print_linked_list(head):
    """Print the linked list"""
    current = head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")


# ------------------------
# Test the code
# ------------------------

if __name__ == "__main__":
    # Example: 1 -> 2 -> 3 -> 4 -> 5, k = 2
    values = [1, 2, 3, 4, 5]
    k = 2

    head = build_linked_list(values)

    print("Original List:")
    print_linked_list(head)

    solution = Solution()
    rotated_head = solution.rotateRight(head, k)

    print("\nRotated List:")
    print_linked_list(rotated_head)
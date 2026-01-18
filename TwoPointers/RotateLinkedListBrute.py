# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        # Edge cases
        if not head or not head.next or k == 0:
            return head

        # Step 1: Find length and tail
        length = 1
        tail = head
        while tail.next:
            tail = tail.next
            length += 1

        # Step 2: Optimize k
        k = k % length
        if k == 0:
            return head

        # Step 3: Find new tail (length - k - 1)
        new_tail = head
        for _ in range(length - k - 1):
            new_tail = new_tail.next

        # Step 4: Rewire pointers
        new_head = new_tail.next
        new_tail.next = None
        tail.next = head

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

package DataStructure.LinkedList.LinkedListProblems;

class Node {
    int data;
    Node next;

    Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListOptimized1 {
    
    public static Node reverseLinkedlistOptimized(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the original Linked List
        System.out.println("Original Linked List");
        printLinkedList(head);

        // reverse the linked List
        head = reverseLinkedlistOptimized(head);

        // Display the value of the middle node
        System.out.println("Reversed Linked List");
        printLinkedList(head);
    }
}

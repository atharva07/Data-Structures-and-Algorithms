package DataStructure.LinkedList.LinkedListProblems;

import java.util.Stack;

class Node {
    
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverseLinkedlist(Node head) {

        // this problem is solved using Stack data structure
        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;
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
        head = reverseLinkedlist(head);

        // Display the value of the middle node
        System.out.println("Reversed Linked List");
        printLinkedList(head);
    }
}

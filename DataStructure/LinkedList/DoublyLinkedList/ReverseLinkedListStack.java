package DataStructure.LinkedList.DoublyLinkedList;

import java.util.Stack;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        //this.prev = prev;
        //this.next = next;
    }
}

class DoublyLinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to reverse the list using stack
    public void reverseUsingStack() {
        if (head == null || head.next == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = head;

        // push the node into the stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // pop the nodes from the stack and reconstruct the list
        head = stack.pop();
        head.prev = null;
        current = head;

        while (!stack.isEmpty()) {
            Node nextNode = stack.pop();
            current.next = nextNode;
            nextNode.prev = current;
            current = nextNode;
        }

        current.next = null;
    }
}

public class ReverseLinkedListStack {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding elements to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original list:");
        list.printList();

        // Reversing the list using stack
        list.reverseUsingStack();

        System.out.println("Reversed list:");
        list.printList();
    }
}

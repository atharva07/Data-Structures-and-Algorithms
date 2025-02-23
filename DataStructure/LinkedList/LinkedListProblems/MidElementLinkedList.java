package DataStructure.LinkedList.LinkedListProblems;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Node Constructor as it sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MidElementLinkedList {
    
    private static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2 + 1;
        temp = head;

        while (temp != null) {
            mid = mid - 1;

            if (mid == 0) {
                break;
            }

            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}